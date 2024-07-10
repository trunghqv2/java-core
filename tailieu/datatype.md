# Datatype

**Java supports various data types, which are broadly classified into two categories: primitive data types and reference data types.**

## Primitive Data Types
### 1. boolean:

Size: ~1 bit (depends on JVM)
Values: true or false
### 2. byte:

Size: 8 bits
Values: -128 to 127
### 3. short:

Size: 16 bits
Values: -32,768 to 32,767
### 4. int:

Size: 32 bits
Values: -2^31 to 2^31-1
### 5. long:

Size: 64 bits
Values: -2^63 to 2^63-1
### 6. float:

Size: 32 bits
Values: IEEE 754 floating-point
### 7. double:

Size: 64 bits
Values: IEEE 754 floating-point
### 8. char:

Size: 16 bits
Values: '\u0000' (or 0) to '\uffff' (or 65,535)
## Reference Data Types
Class Objects: Created using class definitions. Examples include String, Scanner, Random, custom classes, etc.

Example: String name = "John";
Arrays: A container object that holds a fixed number of values of a single type.

Example: int[] numbers = {1, 2, 3, 4, 5};
Interfaces: Used to implement abstraction, a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.

Example: Runnable r = new MyRunnable();
