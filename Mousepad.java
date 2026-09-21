class Calender{
    String name ;
    int age   ;
    public void Cinfo(String name){
        System.out.println(name);
    }
    public void Cinfo(int age){
        System.out.println(age);
    }
     public void Cinfo(String name , int age ){
     System.out.println(name + " " + age);
     }
}


public class Mousepad {
 public static void main (String[]args){
    Calender c1 = new Calender();
    c1.name="IDEA";
    c1.age=12;
    c1.Cinfo(c1.name,c1.age);

 
    }

}
