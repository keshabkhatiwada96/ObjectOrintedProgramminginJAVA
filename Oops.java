class Pen{
    String color ;
    String type ;

    public void write(){
         System.out.println("Writing something");
    }
}
public class Oops {  
    public static void main(String[] args) {
        Pen pen1 = new Pen();
       pen1.color = "red";
       pen1.type = "gel";
       pen1.write();
       
    }
    
}
 