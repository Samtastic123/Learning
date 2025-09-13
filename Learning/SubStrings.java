package Learning;

import java.util.Scanner;

public class SubStrings {
    public static void main(String[] args) {

        // .substring() = A method used to extract a portion of a string
        //                         .substring(start, end)

        String email;
        String username;
        String domain;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert your email please: ");

        email = scanner.nextLine();

        if(email.contains("@")) {
            username = email.substring(0, email.indexOf("@")); // Detects from the first letter to the first '@' sign
            domain = email.substring(email.indexOf("@") + 1); //Goes from the '@' to the rest. '+1' is js skipping 1 past the '@' sign

            System.out.println(username);
            System.out.println(domain);
        } else {
            System.out.println("Your email must contain an '@' sign!");
        }
                    }
                }
