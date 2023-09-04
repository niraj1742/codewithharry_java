// Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your marks in java = ");
        int a=sc.nextInt();
        System.out.print("Enter your marks in Python = ");
        int b=sc.nextInt();
        System.out.print("Enter your marks in Js = ");
        int c=sc.nextInt();
        float avg = (a+b+c)/3.0f;
        if(avg>=40 && a>=33 && b>=33 && c>=33){
            System.out.println("you are pass");
        }
        else{
            System.out.println("you are fail");
        }
    }
}
