
abstract class Vehicle{
    abstract void start();
}
    

 class Car extends Vehicle{
    public void start(){
        System.out.println("car stareted bhrummmm");
    }

}
public class Rossh{
    public static void main(String[] args) {
         Car v1 = new Car();
        v1.start();
    }
}