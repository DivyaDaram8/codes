public class Transient1 {
    
}
class Test implements java.io.Serializable{
    transient int temp;// will not be serialized
}

//NOTES:
// 1. We can make sensitive data members as transient so that they are not serialized.
// 2. While storing an object in a file, if we make a varibale transient, it will not be stored in the file.
// 3. Serialization is the process of converting an object into a byte stream.
// 4. Deserialization is the process of converting a byte stream into an object.



// NATIVE 
// Declares a method implemented in a language like c or c++(native code)

class Ex{
    native void display();// native method, implementation is in native code.
}