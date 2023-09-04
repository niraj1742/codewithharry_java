//Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
       System.out.println("what is your name");
       Scanner sc=new Scanner(System.in);
       String name =sc.next();
       System.out.println("Hey "+name+" have a good day"); 
    }
}
