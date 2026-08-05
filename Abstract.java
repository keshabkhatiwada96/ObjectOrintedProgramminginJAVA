// abstract method is method that is declared without an implementation it is means 
abstract class Animal{
    abstract void makesound();
    public void eat (){
        System.out.println(" animal make eat");

    }
}

class Dog extends Animal {
    //implemantaion for abstarct method
    public void makesound(){
        System.out.println(" bhow bhow");
    }
}
class Abstract{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makesound();
        d.eat();
    }
}