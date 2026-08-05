interface polygon{
    void getArea (int length, int breadth);

}

class Rectangle implements polygon{
    public void getArea(int length, int breadth) {
        System.out.println(" Area of rectangle =  " + (length*breadth));
    }
}

public class Interface {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getArea(5, 6);
    }
}
