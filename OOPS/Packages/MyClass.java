// filepath: /c:/JavaPrac/OOPS/Packages/MyClass.java
package Packages;
import Packages.folderA.Principal;
import Packages.folderA.innerFolderA.P2;
import Packages.folderB.Staff;
// import Packages.AccessModifiers; 
import Packages.folderB.SClassAM;

class Teacher extends Principal {
    String subject = "Maths";
}
class Employee extends P2 {
    String dept = "Admin";
}
class Clerk extends Staff {
    String role = "Clerk";
}
 class A extends ExDefault { // ExDefault is in the same level as Myclass so we can access it directly without importing, this is called default package access or package- private access in java
    int b = 20;
}



//Same class example

// class AccessModifiers {
//     public String a = "public";
//     protected String b  = "protected";
//     String c = "default";
//     private String d = "private";

//     //same class example
//     void display(){
//         System.out.println("Public: " + a);
//         System.out.println("Protected: " + b);
//         System.out.println("Default: " + c);
//         System.out.println("Private: " + d);
//     }
// }


//same package example

// class Am extends AccessModifiers {
//     void display(){
//         System.out.println("Public: " + a);
//         System.out.println("Protected: " + b);
//         System.out.println("Default: " + c);
//         // System.out.println("Private: " + d); // private members are not accessible outside the class
//     }
// }

class SC extends SClassAM{
    // void display(){
    //     System.out.println("Public: " + a);
    //     System.out.println("Protected: " + b);
    //     // System.out.println("Default: " + c); // default members are not accessible outside the package
    //     // System.out.println("Private: " + d); // private members are not accessible outside the class
    // }
}


class DSC extends SClassAM{ // other classes (diff packages)
}


class Meth {
    public void publicMeth(){
        System.out.println("Public method");
    }
    protected void protMeth(){
        System.out.println("Protected method");
    }
    void defMeth(){
        System.out.println("Default method");
    }
    private void privateMeth(){
        System.out.println("Private method");
    }
    void display(){
        publicMeth();
        protMeth();
        defMeth();
        privateMeth();
    }
}


public class MyClass {
    public static void main(String[] args) {
        // System.out.println("This is my package");
        // Teacher t = new Teacher();
        // System.out.println("Name: " + t.name); // name is inherited from Principal
        // System.out.println("Subject: " + t.subject); // subject is a member of Teacher
        // Employee e = new Employee();
        // System.out.println("Name: " + e.name); // name is inherited from P2
        // System.out.println("Department: " + e.dept); // dept is a member of Employee
        // Clerk c = new Clerk();
        // System.out.println("A: " + c.a); // a is inherited from Staff
        // System.out.println("B: " + c.b); // b is inherited from Staff
        // System.out.println("Role: " + c.role); // role is a member of Clerk

        // A a1 = new A(); // ex taken for default package access
        // System.out.println(a1.a);

// Same class example   

        // AccessModifiers am = new AccessModifiers();
        // am.display();


// Same package example

        // Am am1 = new Am();
        // am1.display();

// Subclass example

        // SC sc = new SC();
        // sc.display();


// Different Subclass example
        
        // DSC dsc = new DSC();
        // System.out.println(dsc.a);
        // System.out.println(dsc.b);// b is protected so it is accessible in the subclass


        Meth m  = new Meth();
        // m.display();
        m.publicMeth();
        m.defMeth();
        m.protMeth();
        // m.privateMeth(); // private members are not accessible outside the class
    }
} 