class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a ,int b ,int c){
        return a+b+c;
    }
}
 

public class Mobile {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int num2 = c1.add(10,20);
        System.err.println("Sum of two int = "+num2);
        int num3 = c1.add(10,20 ,30);
        System.err.println("Sum of three int = "+num3);
    }
}
