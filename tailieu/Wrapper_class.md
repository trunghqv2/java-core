# Wrapper classes in Java provide a way to use primitive data types as objects. Each of the eight primitive types has a corresponding wrapper class in java.lang package. These classes are immutable, meaning their values cannot be changed once they are created.

## Primitive Types and Corresponding Wrapper Classes
- boolean → Boolean
- byte → Byte
- short → Short
- int → Integer
- long → Long
- float → Float
- double → Double
- char → Character
***
Why Use Wrapper Classes?
- Collections: Collections like ArrayList, HashSet, etc., can only hold objects, not primitive types.
- Utility Methods: Wrapper classes provide utility methods like parsing strings into primitive types, converting primitive types to strings, etc.
- Null Values: Wrapper classes can represent null values, which is useful in many scenarios where you need to represent the absence of a value.
***
Autoboxing and Unboxing
Java provides a feature called autoboxing to automatically convert between primitive types and their corresponding wrapper classes. Unboxing is the reverse process, where wrapper class objects are converted back to primitive types.