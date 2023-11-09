package com.qmt.tutorial.pojo;

import static java.util.Objects.requireNonNull;

public class EqualsHashCodeToString {

    private final String name;
    private final String description;

    public EqualsHashCodeToString(String name, String description) {
        this.name = requireNonNull(name, "name cannot be null");
        this.description = requireNonNull(description, "description cannot be null");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EqualsHashCodeToString that = (EqualsHashCodeToString) o;

        if (!name.equals(that.name)) return false;
        return description.equals(that.description);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "[name: '" + name + '\'' + ", description: '" + description + '\'' + ']';
    }
}
