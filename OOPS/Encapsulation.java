class Employee{
    private String name = "chinnu";

    //getter method, used to get the value of the private member
    public String getName (){
        return name;
    }
    //setter method, used to set the value of the private member
    public void setName(String name){
        this.name = name;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.getName());
        e.setName("ram");
        System.out.println(e.getName());
    }
}


//NOTES:
// 1. The process of wrapping data (variables) and methods (functions) into a single unit (class) and restricting direct access to some of the object's components.
// 2. uses getters and setters to achieve it.
// 3. Declares variables as private and methods as public
