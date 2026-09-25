 class OYAYA {
    public static void main(String[] args) {
        try {
            int i = 9;
            int j = i/0;
            System.err.println(j);
        } catch (Exception e) {
            
            System.err.println("eroor occured in try");
        }
        finally {
               
            System.out.println("this will run in any conditon either exception or not");
        }
    }
}
