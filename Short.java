class Animal{
    String name;
 public void eat(){
    
    System.err.println("Animal is eating");
 }   
}
class Dog extends Animal{
    public void Bark(){
        System.out.println("dog is barking");
        System.err.println(name);
    }
}

public class Short {
  public static void main(String[] args) {
      Dog d1 = new Dog();
      d1.name = "Tiger";
      d1.Bark();
      d1.eat();
      
  }  
}
