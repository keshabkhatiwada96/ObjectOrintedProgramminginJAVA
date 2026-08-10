public class calculator {
    int add (int a,int b){
        return a + b;
    }
   public static void main(String[] args) {
       calculator c1 = new calculator();
       int result = c1.add(10,30);
    System.out.println(result);
   } 
}
