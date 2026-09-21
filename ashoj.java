class Laptop{
    String name;
    int age;
  
     public void Laptopinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    
    }
}



public class ashoj {
    public static void main(String[] args) {
      Laptop l1 = new Laptop ();
     l1.name = "Acer";
     l1.age=3;  
     l1.Laptopinfo();
    }
    

}
