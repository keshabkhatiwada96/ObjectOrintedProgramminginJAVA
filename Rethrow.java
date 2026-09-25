public class Rethrow {
    public static void check() {
        try {
            int x = 10/0;
        } catch (Exception e) {
            System.err.println("error in check");
            throw e;
        }
        
    }
    public static void main(String[] args) {
        try {
            check();
        } catch ( Exception e) {
            System.out.println("eroor in main");
        }
    }
}
