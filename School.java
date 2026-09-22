class Car{
    String Brand;
    String Color;
    public Car(String Brand,String Color ){
        this.Brand=Brand;
        this.Color=Color;

    }
} 



public class School{
 public static void main(String[] args) {
     Car c1 = new Car("BMW","RED");
     System.out.println(c1.Brand);
     System.out.println(c1.Color);
 }
}
