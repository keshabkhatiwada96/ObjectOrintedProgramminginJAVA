import java.io.FileReader;

public class Checked{
    public static void main(String[] args) {
        

        try {
            FileReader file = new FileReader("data.txt");
            System.err.println("File open sucessufl");
        } 
        catch (Exception e) {
            System.err.println("no such file exception occured");
        }
    }
}