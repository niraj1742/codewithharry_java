// Write a program to find out the type of website from the URL:

// .com – commercial website
// .org – organization website
// .in – Indian website

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String web = sc.next();
        if (web.endsWith(".org")) {
            System.out.println("Your Web Site is organization website");
        } 
        else if (web.endsWith(".com")){
            System.out.println("Your Web Site is commercial website");
        }
        else if (web.endsWith(".com")){
            System.out.println("Your Web Site is Indian website");
        }
    }
}
