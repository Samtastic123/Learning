package Learning.Exercises;

import java.util.Scanner;

public class Banking {
    static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {

        boolean isRunning = true;
        double balance = 0.0;

        while (isRunning == true) {
            chooseOne();
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> balance += deposit();
                case 2 -> balance -= withdraw(balance);
                case 3 -> showBalance(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid number!");
            }

        }
        }
        static void chooseOne () {
            System.out.println("Banking Program: ");
            System.out.println("What would you like to do? (Choose 1-4)");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
        }
        static void showBalance (double balance){
            System.out.printf("$%.2f\n", balance);
        }
        static double deposit() {
            System.out.print("Enter the amount to deposit: ");
            double amountDeposited = scanner.nextDouble();

            if (amountDeposited < 0) {
                System.out.println("Please enter a valid number!");
                return 0;
            } else {
                return amountDeposited;
            }
        }
        static double withdraw(double balance){
            System.out.print("Enter the amount to withdraw: ");
            double amountWithdrawn = scanner.nextDouble();

                if(amountWithdrawn > balance){
                    System.out.println("You do not have enough money to withdraw you brokie!");
                    return 0;
                } else if(amountWithdrawn < 0){
                    System.out.println("Number cannot be negative!");
                    return 0;
                } else{
                    return amountWithdrawn;
                }
        }
    }