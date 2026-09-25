public class Unchecked {
    public static void main(String[] args) {
        String name;
        name = null;
        try {
            name.length();
            System.err.println("length of name = "+ name.length());
        } catch (Exception e) {
            System.err.println("Error occured");
        }
    }
}
