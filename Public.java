class Studnet{
 String name;
 int age ;
 public void setname(String name,int age){
    this.name = name;
    this.age = age;
 System.out.println(name);
 System.out.println(age);
 }
}

public class Public{
    public static void main (String[]args){
        Studnet s1 = new Studnet();
        s1.setname("keshab",20);

    }
}



