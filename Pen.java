abstract class Vehical{
    abstract void Start();
}
class Car extends Vehical{
    public void Start(){
   System.err.println("Car Start with key");
    }
}
public class Pen {
    public static void main(String[] args) {
        Car v1 = new Car() ;
         v1.Start();   
        
    }
}
