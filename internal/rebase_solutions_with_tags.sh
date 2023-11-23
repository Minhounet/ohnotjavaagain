#!/usr/bin/env bash
set -e
set -u

########################################################################################################################
# Functions
########################################################################################################################
current_step=0
function log_step() {
    [[ $# -eq 0 ]] && echo "ERROR: missing message" && return 1
    current_step=$((current_step + 1))
    echo "-----------------------------------------------------------------------------------------------------------------"
    echo "${current_step}) $*"
    echo "-----------------------------------------------------------------------------------------------------------------"
}

########################################################################################################################
# Script execution
########################################################################################################################
echo "================================================================================================================="
read -rp "About to rebase solutions branch with all tags, do you want to continue? (Y/n)" answer
echo "================================================================================================================="
answer=${answer:-N}
if [[ "Y" != "${answer}" ]]; then
    echo "Action is cancelled (please hit \"Y\" if you really want to perform the action which is irreversible"
    exit 0
fi

log_step "Create temp branch for each tags"
for i in  $(git --no-pager tag | xargs); do
  git branch keepTag/"$i" "$i"
done

log_step "Rebase solutions branch"
git checkout solutions
git rebase --update-refs main

log_step "Delete tags"
for i in $(git --no-pager branch | grep keepTag | cut -d'/' -f2- | xargs); do
  git tag -d "$i"
done

log_step "Create tag to new locations"
for i in $(git --no-pager branch | grep keepTag | xargs); do
  tag_name=$(echo $i | cut -d'/' -f2-)
  git tag "${tag_name}" "${i}"
done

log_step "Delete temp branch"
for i in $(git --no-pager branch | grep keepTag | xargs); do
  git branch -D "${i}"
done

log_step "Push solutions branch with all tags"
git push origin solutions --force-with-lease
git push origin --tags --force

log_step "Back to main branch"
git checkout main
echo "================================================================================================================="
