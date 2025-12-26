package Learning.MATH;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BasicMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 100;
        int b = 200;

        //Addition
        int sum = a + b;
        System.out.println("Addition: " + sum);
        //Subtraction
        int sub = a - b;
        System.out.println("Subtraction: " + sub);
        //Multiplication
        int multi = a * b;
        System.out.println("Multiplication: " + multi);
        //Division
        int divi = b / a;
        System.out.println("Division: " + divi);
        //Remainder
        int remainder = 101 % 2;
        System.out.println("Remaining from 101/2: " + remainder);
        //Extra math methods
        System.out.println("Absolute Value: " + Math.abs(-100)); //Absolute Value

        System.out.println("Ceiling: " + Math.ceil(1.23)); //Rounding up

        System.out.println("Round: " + Math.round(1.23)); //Rounding

        System.out.println("Floor: " + Math.floor(1.23)); //Rounding down

        System.out.println("Minimum: " + Math.min(10, 200)); //Minimum of 2 numbers
        System.out.println("Maximum: " + Math.max(37, 750)); //Maximum of 2 numbers

    }
}