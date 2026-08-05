
class Student{
    String name = "Ram";
}

public class ObjectClassDemo {
   public static void main(String[] args) {
    
    Student s = new Student ();
    System.out.println(s.toString());
    System.out.println(s.getClass());
   } 
}
