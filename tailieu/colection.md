# Collection in Java
In Java, a collection refers to a group of objects that are stored and managed collectively. The Collection Framework in Java provides interfaces and classes to manipulate groups of objects easily and efficiently. Here are some fundamental concepts about Collection in Java:

## Basic Interfaces
Collection Interface: This is the root interface for all collection types in Java. It provides fundamental methods such as add(), remove(), contains(), isEmpty(), etc.

List Interface: Represents an ordered collection that allows duplicate elements. Implementing classes include ArrayList, LinkedList, Vector.

Set Interface: Represents a collection that does not allow duplicate elements. Implementing classes include HashSet, LinkedHashSet, TreeSet.

Map Interface: Represents a collection of key-value pairs where each key is unique. Implementing classes include HashMap, LinkedHashMap, TreeMap.

Queue Interface: Represents a collection designed for holding elements prior to processing. Implementing classes include LinkedList, PriorityQueue.

## Commonly Used Implementations
1. ArrayList: Resizable array implementation of the List interface.
2. LinkedList: Doubly linked list implementation of the List interface.
3. HashSet: Implements the Set interface using a hash table.
4. HashMap: Implements the Map interface using a hash table.
5. TreeSet: Implements the Set interface using a sorted tree structure.
6. TreeMap: Implements the Map interface using a red-black tree.
## Characteristics of Collection Framework
Generic: Supports generics to ensure type safety.
Iterating: Provides iterators and enhanced for-loop for traversing elements.
Algorithms: Offers algorithms for common operations like sorting and searching.
Concurrency: Provides synchronized collections for thread-safe operations in concurrent environments.                         