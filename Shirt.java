class Student {
    private String name;
    private int number;
  public void setname(String name){
       this.name = name;
  }
    public String getname(){
        return name;
    }

   public void setnumber(int number){
        this.number = number;
   }
  public int getnumber(){
    return number;
  }
}
public class Shirt {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setname("keshab");
        s1.setnumber (20);
        System.out.println(s1.getname());
    }
}
