
class IsFailedException extends Exception{
    IsFailedException(String message){
        super(message);
    }
}
public class Exceptions {
    static void checkMarks(int marks) throws IsFailedException{
        if(marks < 40){
            throw new IsFailedException("Student is Failed");
        }
        System.out.println("Student Passed");
    }

    public static void main(String[] args){
        try{
            checkMarks(35);
        }
        catch(IsFailedException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally{
            System.out.println("Program continues.....");
        } 
    }
}
