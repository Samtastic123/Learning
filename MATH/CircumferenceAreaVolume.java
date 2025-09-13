package MATH;

import java.util.Scanner;

public class CircumferenceAreaVolume {
    public static void main(String[] args) {

        // CIRCUMFERENCE, AREA & VOLUME (for sphere) *sigh*

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
        Scanner scanner = new Scanner(System.in);

        double circumference;
        double area;
        double volume;
        double radius;

        //CIRCUMFERENCE
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        circumference = 2 * Math.PI * radius;

        System.out.println("the circumference is: " + circumference + "cm");
        //AREA
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area is: " + area + "cm^2");
        //VOLUME
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // only do 4/3 when calculating for sphere
        System.out.println("The volume is: " + volume + "cm^3");
        //Quick usage for printf, another file on that
        System.out.printf("The circumference is: %.1fcm\n", circumference);

        System.out.printf("The area is: %.1fcm^2\n", area);

        System.out.printf("The volume is: %.1fcm^3", volume);
    }
}
