//Write a Java program to convert miles to kilometer.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("how many miles did you Run today");
        Scanner Run=new Scanner(System.in);
        double mi=Run.nextDouble();
        double Km = 1.6;
        double kilometer=(mi*Km);
        System.out.println("total kilometer you run = "+kilometer );
    }
}
