package Learning;

import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What day is it? (capitlize the first letter please)");
        String day = scanner.nextLine();

        // arrow (->) means in this code below that if the DAY is MONDAY then DO THIS, an if statement but used for efficiency
        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday :(");
            case "Saturday", "Sunday" -> System.out.println("It is a weekend!");
            default -> System.out.println("That is not a valid day!"); //In a switch statement, the default keyword specifies a block of code to be executed if none of the case labels match the value of the switch expression.
        }
    }
}
