package Learning;

import java.util.Scanner;
import java.util.SortedMap;

public class WhileLoops {
        public static void main(String[] args) {
            // repeat some code forever WHILE condition remains true

            Scanner scanner = new Scanner(System.in);
            String name = "";

            while (name.isEmpty()) { //While this condition is true, continue this code forever until not true
                System.out.print("Enter your name: ");
                name = scanner.nextLine();
            }

            System.out.println("Hello " + name + "!");

            String response = "";

        while (!response.equals("Q")) {
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }
            System.out.println("You have quit the game.");

            int age = 0;
            System.out.print("Enter your age: ");
            age = scanner.nextInt();

            while(age < 0) {
                System.out.println("You're age can't be negative");
                System.out.print("Enter your age: ");
                age = scanner.nextInt();
            }
            System.out.println("You are " + age + " years old");

            int number = 0;

            do { //Do this code once, check the condition at the end
                System.out.print("Enter a number between 1 and 10: ");
                number = scanner.nextInt();
            }while(number < 1 || number > 10);

            System.out.println("You picked " + number);

            scanner.close();
        }
}
