class Calculator {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

public class book {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        c1.add(10, 20);
        c1.add(10, 20, 30);
    }
} 