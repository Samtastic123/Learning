package Learning.Basics;

import java.util.Scanner;
// if statements perform if block of code is true
public class IfStatements {
    public static void main(String[] args) {
        boolean isStudent;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        if(name.isEmpty()) { //when you call isEmpty() its checks well, if it's empty
            System.out.println("Please enter your name!");
        } else {
            System.out.println("Hello " + name + ":)");
        }
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if(age >= 65) {
            System.out.println("You are a senior!");
        } else if(age >= 18) {
            System.out.println("You are an adult!");
        } else if(age < 0) {
            System.out.println("You have not been born yet!");
        } else if(age == 0) {
            System.out.println("You are a baby!");
        } else {
            System.out.println("You are a child!");
        }
        System.out.println("Are you a student true/false?");
        isStudent = scanner.nextBoolean();
        if(isStudent == true) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student!");
        }
    }
}
