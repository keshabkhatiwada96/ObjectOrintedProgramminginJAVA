class Country{
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
    return  number;
 }
}


public class Boat {
    public static void main(String[] args) {
        Country c1 = new Country();
        c1.setname("NEPAL");
        c1.setnumber(977);

        System.out.println(c1.getname());
        System.out.println(c1.getnumber());
    }
}
