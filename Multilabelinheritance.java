class Father {
 String name;
 int number;
public void Finfo(){
  System.out.println(name);
  System.out.println(number);
}
}

class Son extends Father {
 String location;
 int age;
public void Sinfo(){
     System.out.println(name);
     System.out.println(number);
     System.out.println(location);
     System.out.println(age);
}
}

class Grandson extends Son{
int height;
public void Ginfo(){
     System.out.println(name);
     System.out.println(number);
     System.out.println(age);
     System.out.println(height);
     System.out.println(location);
}
}
public class Multilabelinheritance {
    public static void main(String[] args) {
       Grandson g1 = new Grandson();
    g1.name="keshab";
    g1.location = "Jhapa";
    g1.age=20;
    g1.number = 45;
    g1.height= 5 ;

    System.out.println("---------Father info--------");
    g1.Finfo();

    System.out.println("----------Son info-------");
    g1.Sinfo();

    System.out.println("-------Grandson info---------");
    g1.Ginfo();

}
 
}
    