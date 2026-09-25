public class Throw {
    public static void main(String[] args) {
        int age = 25;
        try {
             if (age < 18) {
            throw new Exception("Age is above 18");
            
        }
        System.err.println("welcome");
        } catch (Exception e) {
            System.out.println("error age is below 18");
        }
       

        
    }
}
