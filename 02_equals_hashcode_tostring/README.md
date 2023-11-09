# equals, hashcode and toString 
In the previous [chapter](../01_pojo/README.md) we learnt how to create a POJO. It is very commun to test equality
between these objects. How do you say that an object is equals to another ?

- This is not with the "==" which tests if it exactly the same object (same reference)
- You have to define the **equals** method
- If you define the **equals** you have to define **hashCode** method which return an int
  - Two equal objects must return the **<u>same</u> hashCode**
=> for instance hashCode is used to improve performance when the object is in a collection (hashMap)
- You generally define also the toString method which is the "String version" of the object, mostly used for logging.

# Steps

Write your solution in [src/main/java/com/qmt/tutorial/pojo](src/main/java/com/qmt/tutorial/pojo) then run
"mvn clean install"

Check the solution on this matching tag "git checkout solution/02_pojo"