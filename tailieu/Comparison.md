# Comparison 

In Java, there are various ways to compare values and objects. These include comparing primitive values, strings, and objects.

## Comparing Primitive Values
Primitive values like int, float, double, char, etc., can be compared using comparison operators: ==, !=, <, >, <=, >=.

## Comparing Strings
Strings in Java are objects and should not be compared using == as == checks if two object references point to the same object. Instead, you should use the equals() or compareTo() method.

equals(): Compares the content of two strings.
compareTo(): Compares two strings lexicographically.

## Comparing Objects
To compare objects, you can use the equals() method that is overridden from the Object class, or use the Comparable and Comparator interfaces.

equals(): By default, this method compares references. You should override this method to compare the content of objects.
Comparable: This interface has the compareTo() method to define the natural ordering of objects.
Comparator: This interface has the compare() method to define custom ordering of objects.