//multiple inheritance can be done using java interface a
//  class can be implemented multiple interfaces which allow 
// it to inherit the abstrat methods from all  the interface
//this is a way 

interface AnimalEat{
    void eat();

}
interface AnimalTravel{
void travel();

}
class Animal implements AnimalEat, AnimalTravel{
public void eat(){
    System.out.println(".(animal is eating )");
}
public void travel(){
    System.out.println(".(animal is traveling )");
}
}
public class Multipleinheritance {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.travel();
    }

}
