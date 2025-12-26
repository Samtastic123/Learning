package Learning.Exercises;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args){


        // JAVA SLOT MACHINE

        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("------------------------");
        System.out.println("Welcome to Java Slots!");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("------------------------");

        while(balance > 0){
            System.out.println("Current Balance: $" + balance);
            System.out.println("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if(bet > balance){
                System.out.println("Get more money brokie");
                continue;
            } else if(bet <= 0){
                System.out.println("u kinda stupid u cant put invalid numbers");
                continue;
            } else{
                balance -= bet;
            }
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            System.out.println();
            payout = getPayout(row, bet);

            if(payout > 0){
                System.out.println("Congratulations, you won $" + payout + "! Now you can waste all that money u got on more gambling!");
                balance += payout;
            } else{
                System.out.println("Thats y u dont gamble, but you should still keep going!");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }

        }

        System.out.println("Game over! Your final balance is $" + balance);

        scanner.close();

    }
    static String[] spinRow(){

        String[] symbols = {"🍒", "🍉", "🍋", "🔔","⭐"};
        String[] row = new String[3];
        Random random = new Random();


        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }


        return row;
    }
    static void printRow(String[] row){
        System.out.print(" " + String.join(" | ", row));
    }
    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[0].equals(row[2])){
            return switch (row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }

        return 0;
    }

}
