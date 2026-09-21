class vehical{
    String name;
    String type;
    String color;
    int number;
    public void Carinfo(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.color);
        System.out.println(this.number);
    }
}

public class Car {
    public static void main (String[]args){
        vehical v1 = new vehical ();
        v1.name="BMW";
        v1.type="sedan";
        v1.color="black";
        v1.number=0007;
        v1.Carinfo();
    }
}
