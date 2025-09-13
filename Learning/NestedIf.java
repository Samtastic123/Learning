package Learning;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Like this:
        if() {
            if() }
         */

        boolean isStudent;
        boolean isSenior;
        double price = 9.99;
        System.out.println("Are you a student? (true or false)");
        isStudent = scanner.nextBoolean();
        System.out.println("Are you a senior? (true or false)");
        isSenior = scanner.nextBoolean();
        if(isStudent) {
            if(isSenior) {
                System.out.println("You get a senior discount of 20%!");
                System.out.println("You get a student discount of 10%!");
                price *= 0.7;
            }
        } else {
            if(isSenior) {
                System.out.println("You get a senior discount of 20%!");
                price *= 0.8;
            } else {
                if(isStudent) {
                    System.out.println("You get a student discount of 10%!");
                    price *= 0.9;
                }
            }
        }
            System.out.printf("The price of a ticket is $%,.2f", price);
    }
}
