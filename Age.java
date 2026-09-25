class AgeException extends Exception{

    AgeException(String message) {
    super(message);
 }
    
 }

 public class Age {
    public static void main(String[] args) {
       int age = 20;
    try {
    if(age <= 18){
    throw new AgeException("Age must be 18 or above");
    }
    System.err.println("Valid age ");
   }
    catch(AgeException e){
        System.err.println(e.getMessage());
    }
 }
 
    }
    