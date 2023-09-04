//Write a Java program to detect double and triple spaces in a string.
public class Q4 {
public static void main(String[] args) {
    String text =" This string is detect for double and triple   space   ";
    System.out.println(text.indexOf("  "));
    System.out.println(text.indexOf("   "));
}    
}
