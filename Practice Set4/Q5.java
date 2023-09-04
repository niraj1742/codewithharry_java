//Write a Java program to find whether a year entered by the user is a leap year or not.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to find out if it is a leap year or not: ");
        year = sc.nextInt();
        
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "This is a leap year");
        } else {
            System.out.println(year + "This is not a leap year");
        }
    }
}
