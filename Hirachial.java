class Animal{
    String Sound;
    int height;
    public void Ainfo(){
        System.out.println(Sound);
        System.out.println(height);
    }
}
class Dog extends Animal{
    String Color;
    
    public void Dinfo(){
        System.out.println(Sound);
        System.out.println(height);
        System.out.println(Color);
        
    }
}
class Cat extends Animal{
    int length;
    String Color;
    
    public void Cinfo(){
        System.out.println(Sound);
        System.out.println(height);
        System.out.println(Color);
        System.out.println(length);
        
    }
}



public class Hirachial {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        c1.Sound = "meoww meoww";
        c1.height = 5;
        c1.Color = "Black";
        c1.length = 8;

        d1.Sound = "Bhow Bhow";
        d1.height = 12;
        d1.Color = "white";

        d1.Dinfo();
        c1.Cinfo();

        
    }
}
