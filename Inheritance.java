class Father{
    String name;
    int number;
    public void Finfo(){
        System.out.println("Father info");
    }
}
class Son extends Father{
  int age;
  public void Sinfo(){
    System.out.println(name);
    System.out.println(number);
    System.out.println(age);
  }
}


public class Inheritance {
    public static void main (String[]args){
     Son s1 = new Son();
     s1.name = "khatiwada";
     s1.number = 226;
     s1.age = 20;
     s1.Sinfo();

    }
}
