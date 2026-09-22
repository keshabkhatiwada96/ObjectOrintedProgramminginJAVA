class Animal{
    String name;
    String eat;
 public void ainfo(){
  System.out.println(name);
  System.out.println(eat);
 }
}
class Dog extends Animal{
    String bark;
    public void dinfo(){
        System.out.println(bark);
    }
}


public class Pet {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "simba";
        d1.eat = "eating";
        d1.bark="bhow bhow";
        d1.ainfo();
        d1.dinfo();
    }
}
