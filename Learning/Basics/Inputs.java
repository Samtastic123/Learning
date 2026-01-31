package Learning.Basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any number!");
        int number = scanner.nextInt();
        System.out.println("You just typed " + number + "!");
        System.out.println("Great! Now type any word");
        String letters = scanner.next();
        System.out.println("You just typed " + letters + "!");
        System.out.println("Last but not least, type any decimal!");
        double decimal = scanner.nextDouble();
        System.out.println("You just typed " + decimal + "!");
    }
}
