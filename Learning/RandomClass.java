package Learning;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        // Calls the Random statement
        Random random = new Random();
        //Generates any random number between 1 and 1 billion
        int number = random.nextInt(); //WORKS but very large
        //Generates random number between given range
        int lowNumber = random.nextInt(1, 11); //MINIMUM AND MAXIMUM (you will never get the maximum, so always increase by 1)

        System.out.println(number);
        System.out.println(lowNumber);
        // Generating 3 numbers between 1 and 100
        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1, 101);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        // Generating Doubles
        double numberDouble;
        numberDouble = random.nextDouble(); // Again, very large number
        System.out.println(numberDouble);
        //USING BOOLEANS
        boolean isHeads;
        System.out.println("Let's flip a coin!");
        isHeads = random.nextBoolean();
        if(isHeads == true) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}
