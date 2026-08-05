public class Stringjava{
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "java";
        System.err.println(s1);
        System.err.println(s2);
        String s3 = s1 + s2;
        System.err.println(s3);
        int s4 = s3.length();
        System.out.println(s4);
        String text = "java programming";
        System.err.println(text.length());
        System.err.println(text.toUpperCase());
        System.err.println(text.toLowerCase());
        System.err.println(text.charAt(9));
        System.out.println(text.equals("Java programming"));
    }
}