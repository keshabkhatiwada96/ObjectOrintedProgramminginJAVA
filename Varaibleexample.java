public class Varaibleexample {
 
    int b=1; //instance variable
    static int c=1; //static variable
    void display()
    {
        int a=1;  //local variable
        b++;
        a++;
        c++;
        System.out.println("value of a is " +a);
        System.out.println("value of b is " +b);
        System.out.println("value of c is " +c);
    }
    public static void main(String[] args) {

        Varaibleexample ve1=new Varaibleexample();
        ve1.display();
    }
}