//instamce of operator example
class Animal{

}
 class Dog extends Animal{

}
 public class InstanceofOperator {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = new Animal();
        System.out.println(a instanceof Dog);
        System.out.println(a instanceof Animal);
    }
}
