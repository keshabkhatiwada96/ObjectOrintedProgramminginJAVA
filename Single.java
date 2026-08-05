class First{
    int a, b;
    void getData(){
        a = 4;
        b = 5;
    }
}
class Second extends First{
    void display(){
        int c = a + b;
        System.out.println("The sum is: " + c);
    }
}
public class Single{
    public static void main(String[]args)
    {
        Second sc = new Second();
        sc.getData();
        sc.display();
    }
}