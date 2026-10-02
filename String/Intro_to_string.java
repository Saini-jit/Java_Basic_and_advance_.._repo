/*A String in Java is an object used to store a sequence of characters enclosed in double quotes.
It uses UTF-16 encoding and provides methods for handling text data.
Each character in a string is stored using 16-bit Unicode (UTF-16) encoding.
Means each character is of 2 Bytes.
In java there is no use of \0 (null character) in the end of the string to show the end of the strng like C of C++ .
The length of the string in java is same as par the number of characters unlike C or C++ or other low level language.
Ways Of Creating a Java String
There are two ways to create a string in Java: 

1. String literal (Static Memory)
 A string literal is created by assigning a sequence of characters directly to a String variable using double quotes.
 Java stores string literals in the String Constant Pool, allowing identical string values to share the same object.
 it means if ve create a string using String st= "text"; then if there is a same text avelable in the String Constent Pool then
 the the st object refers to the pree stred text mence using the String literal way any amount of the objects having same string text points
 to the or reffers to the same string pree saved in the String Constent Pool 
2. Using new keyword (Heap Memory)
 Using the new keyword creates a new object in heap memory, even if the same string already exists in the pool.
 One object is created in the heap memory
 The string literal is stored in the string pool (if not already present)
 The reference variable points to the heap object, not the pool

 Interfaces and Classes in Strings
  CharSequence Interface
   The CharSequence interface represents a sequence of characters in Java.
   It provides common methods such as length(), charAt(), subSequence(), and toString() for working with character sequences.
  Common classes that implement CharSequence include:
    String: An immutable class whose contents cannot be modified after creation; any modification results in a new String object
    if we do as String st= "hellow"; and then st ="by" then the output will be by but becase of the variable st is pointing to the by now 
    and the hellow is present in the pool yet and not going to distory because of the pool is used to stor the strings which can be used
    more then one time until the program is end this pools string remain save and in the end of the program the pool leavs the heap memory.
    
    StringBuffer: A mutable and thread-safe class used for string manipulation, particularly when synchronization is required.
    
    StringBuilder: A mutable and non-thread-safe class commonly used for efficient string manipulation when synchronization is not required.*/
