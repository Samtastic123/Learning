package MATH;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        // HYPOTENUSE c = java.lang.Math.sqrt(a2 + b2)
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the length of side C: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side D: ");
        b = scanner.nextDouble();

        System.out.println(a);
        System.out.println(b);

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse (side c) is: " + c + "cm");


        scanner.close();

    }
}
