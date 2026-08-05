//wap in java taking num from keyboarf
import java.util.Scanner;



public class ADD {
    public static void main (String [] args)

{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Principle : ");
    int P= sc.nextInt();
    System.out.println("Enter the Time : ");
    int T= sc.nextInt();
    System.out.println("Enter the Rate : ");
    int R= sc.nextInt();
    int SI= (P*T*R)/100;
    System.out.println("SIMPLE INTREST= " +SI);
}





}
