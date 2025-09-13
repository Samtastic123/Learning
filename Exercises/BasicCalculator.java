package Exercises;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = 0;
        boolean isValidEquation = true;

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        switch(operator) {
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> {
                result = firstNumber / secondNumber;
                if(secondNumber == 0) {
                    System.out.println("You cannot divide by 0!");
                    isValidEquation = false;
                } else {
                    result = firstNumber / secondNumber;
                }
            }
            case '^' -> result = Math.pow(firstNumber, secondNumber);
        }
        System.out.printf("The result is %.2f", result);

    }
}
