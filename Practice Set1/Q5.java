//Write a Java program to detect whether a number entered by the user is an integer or not.

import java.util.Scanner;

public class Q5 {
  public static void main(String[] args) {
    System.out.println("Enter your number");
    Scanner num=new Scanner(System.in);
    System.out.println(num.hasNextInt());
}  
}
