package Exercises;

import java.util.Scanner;

public class ExcerciseShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What would you like to buy?: ");
        String thingToBuy = scanner.nextLine();
        System.out.print("What is the price for each?: ");
        double priceToBuy = scanner.nextDouble();
        System.out.print("How many would you like to buy?: ");
        int howManyToBuy = scanner.nextInt();
        System.out.println("You have bought " + howManyToBuy + " " + thingToBuy + "/s for:");
        double totalPrice = priceToBuy * howManyToBuy;
        System.out.println(totalPrice);
    }
}
