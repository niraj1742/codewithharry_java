//Calculate income tax paid by an employee to the government as per the slabs mentioned below:
// Income Slab 	    Tax
// 2.5L – 5.0L  	5%
// 5.0L – 10.0L 	20%
// Above 10.0L	    30%
// Note that there is not tax below 2.5L. Take the input amount as input from the user.
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        double tax = 0;

        if (income < 250000) {
            System.out.println("You don't have to pay tax.");
        } else if (income >= 250000 && income <= 500000) {
            tax = 0.05 * (income - 250000);
            System.out.println("You have to pay 5% income tax: " + tax);
        } else if (income > 500000 && income <= 1000000) {
            tax = 0.2 * (income - 500000) + 25000; // 5% on the first 250000 + 20% on the rest
            System.out.println("You have to pay 20% of income tax: " + tax);
        } else {
            tax = 0.3 * (income - 1000000) + 125000; // 5% on the first 250000 + 20% on the next 500000 + 30% on the rest
            System.out.println("You have to pay 30% of income tax: " + tax);
        }
    }
}
