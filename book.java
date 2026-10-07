class Animal{
    String type;
    String color;
   
    }

class Dog extends Animal{
    
    int weight;

}
class Puppy extends Animal{
    int height;
}


public class book{
public static void main(String[] args) { 

  Puppy p1 = new Puppy();
  Dog d1 = new Dog();

  p1.type = "german-shepard" ;
  p1.color = "red";
  d1.weight = 10;
  p1.height = 20;

  System.out.println(p1.type);
  System.out.println(p1.color);
  System.out.println(p1.height);
  System.out.println(d1.weight);
   
}

}

