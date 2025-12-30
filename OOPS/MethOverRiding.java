public class MethOverRiding {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create a Dog object
        myDog.makeSound(); // Calls the overridden method in Dog class
    }
}

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    // @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
// Method over riding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
// parent class method is overridden by the child class method with the same name and signature.
// Same method name with same number, type and order of parameters is called method overriding.
// @override annotation is used to check if the method is overridden or not. 
//Which is optional. It is not mandatory to use @override annotation. But saves time and effort if the code is checked by someone else. 
//It is good practice to use @override annotation.
// If the method is not overriden but mentioned as @override, then it will show an error, that the method is not overriden.


// In the above example parent class is Animal and child class is Dog.
// In the above example, the makeSound method of the Animal class is overridden in the Dog class.
// Animal and dog classes have the same method name makeSound but different implementations.


