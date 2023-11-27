# lombok
This chapter introduce Lambda to you. I would say that from Java that this is the main improvement form Java 8 because
it opens all things to you.
What is a Lambda? It cannot more simple that saying that this is just a function. For an input you have an output

Here is an example of lambda which take an int and return a new int incremented by one.

```Function<Integer, Integer> lambdaExample = x -> x + 1;```

# Steps

Write your solution in [src/main/java/com/qmt/tutorial/lambda](src/main/java/com/qmt/tutorial/lambda) then run
"mvn clean install"

- You will have to implement first CountVowelsFunction which is a not a lambda. Passing an object would be the old way
to act as a lambda.
- Then you will have to implement the countVowelsFunction **as a lambda**.

Note: y is always considered as vower in French.

Check the solution on this matching tag "git checkout solution/05_lambda"