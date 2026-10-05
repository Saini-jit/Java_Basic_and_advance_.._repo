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
    
    StringBuilder: A mutable and non-thread-safe class commonly used for efficient string manipulation when synchronization is not required.
    
    == operator and equals() method
    == operator is use for only comparing premetive tatatyps and object refrences menas addresses mens if fe compair the two strings using == and 
    ther objects then if the are made by the string littrels mens stored in the string constent pool and the content is same ten the address weill be 
    the same for both object refrences of the strings and it will return true but if the content is same and the object refrences or addresses are 
    different then it will return false for instence one string object refres to the string pooled object and another is stored in the normal heap 
    memory or both are stred in the heap memory because of creatied by using new keyword or any method like concat() etc then there addresses will be 
    different and the it will return false.
    equals() method is sued to compare the content stored on the objects refrences means if the addresses are different of the differenct string 
    objects but with same contennt then it will return true this method is defined in the Object class.
    
    .intern() method : .intern() method is used to stor the string string in the string pool or to reffer to the same object if abelabel in the 
    string constent pool. the string objects with are made using the new keyword or by andy method like cocat() because of String class is immutable 
    and no alteration can be done in the predefined string objects and thes methods not changes the string content but creats an another object in 
    the normal heap memory then these objects are refered or created in the string constent pool using the intern() method.
    
    String class is immutable means it can't be altered if once and object of a String is created it it is thread safe also because of immutability 
    once and string is created then no other method or can't alter it so if any number of threads can access it at once because it is only can be 
    accessed not alloud to be altered.
    
    Implements Interfaces :The String class implements several interfaces that provide features such as character-sequence handling, comparison, 
    serialization, and constant description.
      CharSequence: Provides methods for accessing a sequence of characters, such as charAt() and length().
      Comparable<String>: Enables lexicographical comparison of strings using compareTo().
      Serializable: Allows String objects to be serialized.
      Modern Java versions also support additional interfaces related to constant descriptions.

    String Constructors in Java
      In Java, String constructors are used to create new String objects from different sources like character arrays, byte arrays, or another string.
      Although strings in Java are usually created using string literals, the String class also provides constructors for more control.
      for instence :
      // Constructor 1: Creating string using new keyword
        String str1 = new String("Hello Java");
      // Constructor 2: Creating string from character array
        char[] charArray = { 'J', 'A', 'V', 'A' };
        String str2 = new String(charArray);
      // Constructor 3: Creating string from byte array
        byte[] byteArray = { 72, 101, 108, 108, 111 };
        String str3 = new String(byteArray);
        
        for more go to the geeksforgeeks.

StringBuffer class in Java represents a sequence of characters that can be modified, which means we can change the content of the StringBuffer 
    without creating a new object every time. It represents a mutable sequence of characters.
       Unlike String, we can modify the content of the StringBuffer without creating a new object.
       All methods of StringBuffer are synchronized, making it safe to use in multithreaded environments.
       Ideal for scenarios with frequent modifications like append, insert, delete or replace operations.
    Interface Hierarchy Implemented by StringBuffer
       The diagram shows the interfaces implemented by StringBuffer and illustrates its relationship with Appendable, CharSequence, and Serializable 
       in Java.
    Constructors of StringBuffer Class
StringBuffer(): It reserves room for 16 characters without reallocation
StringBuffer(int size): It accepts an integer argument that explicitly sets the size of the buffer.
StringBuffer(String str): It accepts a string argument that sets the initial contents of the StringBuffer object and reserves room for 16 more 
characters without reallocation.

StringBuilder is a mutable sequence of characters provided by the java.lang package. Unlike String, its contents can be modified without 
creating a new object for every operation. It is commonly used when a string needs to be changed frequently, especially in single-threaded 
applications
    It provides similar functionality to StringBuffer, but without thread safety.
    StringBuilder is not synchronized, so it performs better in single-threaded applications.
    Use StringBuffer only when thread safety is required; otherwise, prefer StringBuilder for improved performance.

Hierarchy of StringBuilder
StringBuilder extends AbstractStringBuilder and implements Serializable, CharSequence, and Comparable<StringBuilder>.

StringBuilder Constructors
StringBuilder class provides multiple constructors for different use cases.

StringBuilder() : Creates an empty builder with a default capacity of 16 characters.
StringBuilder(int capacity) : Creates an empty builder with a specified initial capacity.
StringBuilder(String str) : Initializes the builder with the content of the given String.
StringBuilder(CharSequence cs) : Initializes the builder with the given CharSequence (for example, String or StringBuffer).
    
    */
