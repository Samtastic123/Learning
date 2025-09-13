package Learning;

import java.util.Scanner;

public class Booleans {
    public static void main(String[] args) {
        // Booleans and logic

        //Comparisons (<, <= >= > == !=)
        //(<, <=) means greater than, greater than or equal to
        //(>= >) means lesser than, lesser than or equal to
        //(==, !=) means equal to and not equal to
        int points = 70;
        int pointsToPass = 80;
        boolean hasPassedTest = points >= pointsToPass; //Greater than or equal to
        System.out.println("Has passed the test: " + hasPassedTest);

        int health = 1;
        boolean isAlive = health > 0;
        System.out.println("He is alive: " + isAlive);

        boolean test = 100 == 100; //true
        boolean secondTest = 100 != 100; //false
        System.out.println("100 equals 100: " + test);
        System.out.println("100 does not equal 100: " + secondTest);

        //LOGIC (AND OR AND NOT)

        // OR
        // a | b | c
        // 0 | 0 | 0
        // 1 | 0 | 1
        // 0 | 1 | 1
        // 1 | 1 | 1

        // AND
        // a | b | c
        // 0 | 0 | 0
        // 1 | 0 | 0
        // 0 | 1 | 0
        // 1 | 1 | 1

        // NOT
        // a | !a
        // 0 |  1
        // 1 |  0
/*AND:
The "and" operator (often represented as && or AND) evaluates to true only if both of the expressions it connects are true. If either expression is false, the entire "and" expression is false.
Example: (x > 5) AND (y < 10) is true only if x is greater than 5 and y is less than 10.
OR:
The "or" operator (often represented as || or OR) evaluates to true if at least one of the expressions it connects is true. The expression is false only if both expressions are false.
Example: (a == 1) OR (b == 2) is true if a is equal to 1, or b is equal to 2, or both are true.
NOT:
The "not" operator (often represented as ! or NOT) reverses the logical value of its operand. If the operand is true, "not" makes it false, and vice versa.
Example: NOT (x > 5) is true if x is not greater than 5 (i.e., x is less than or equal to 5).
 */
        boolean passedTest1 = false;
        boolean passedTest2 = true;
        boolean hasHonors = passedTest1 && passedTest2;
        System.out.println("Has honors: " + hasHonors);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Im guessing your from USA or Italy. If you are from USA, type true or false");
        boolean isUs = scanner.nextBoolean();

        int adultItaly = 14;
        int adultUs = 18;
        int drinkUs = 21;
        int drinkItaly = 18;

        boolean isAdult = isUs && age >= adultUs || !isUs && age >= adultItaly;
        System.out.println("Are you an adult? " + isAdult);

        System.out.println("But wait! Can you drink?");
        System.out.println("Type 'idk' to find out");
        scanner.next();
        boolean canDrink = isUs && age >= drinkUs || !isUs && age >= drinkItaly;
        System.out.println("Can drink alcoholic beverages: " + canDrink);
    }
}
