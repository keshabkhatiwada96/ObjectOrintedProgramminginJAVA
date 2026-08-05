 // creating class inside class for better hiding of data
class OuterClass {
    int x=10;
    class innerClass {
        int y=20;
        void display() {
            System.out.println("Value of x: " + x);
            System.out.println("Value of y: " + y);
        }
    }
}
    public class ClassinsideClass {
        public static void main(String[] args) {
            OuterClass outer = new OuterClass();
            OuterClass.innerClass inner = outer.new innerClass();
            inner.display();
        }
    }