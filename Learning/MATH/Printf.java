package Learning.MATH;

public class Printf {
    public static void main(String[] args) {
       // FLAGS
        // + = shows whether it is positive or negative
        // , = comma grouping separator (shows commas in large numbers)
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        // printf() is a method used to format output, and is an alternative to print and println

        // % [flags] [width] [.precision] [specifier-character]
        // Always start printf with %
        String name = "Spongebob"; // To insert String into printf, use lowercase 's'
        char firstLetter = 'S'; // Lowercase 'c' for printf
        int age = 30; // Lowercase 'd'
        double height = 60.5; // Lowercase 'f'
        boolean isEmployed = true; // Lowercase 'b'
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("Your are %d years old\n", age);
        System.out.printf("You are %.1f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);
        System.out.printf("%s is %d years old, his height is %.1fin, his name starts with %c, and employed = %b\n", name, age, height, firstLetter, isEmployed);
        System.out.println(" ");
        // Precision
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("Precision: %.2f\n", price1);
        System.out.printf("Precision: %.2f\n", price2);
        System.out.printf("Precision: %.2f\n", price3);
        System.out.println(" ");
        //Showing positive/negative numbers
        System.out.printf("Showing positive and negative numbers: %+.2f\n", price1);
        System.out.printf("Showing positive and negative numbers: %+.2f\n", price2);
        System.out.printf("Showing positive and negative numbers: %+.2f\n", price3);
        System.out.println(" ");
        //Showing commas in thousands place
        double price4 = 1000000000.10;
        double price5 = 9290312312.123;
        double price6 = 8914321123.352;

        System.out.printf("Showing commas in the thousands place: %,.2f\n", price4);
        System.out.printf("Showing commas in the thousands place: %,.2f\n", price5);
        System.out.printf("Showing commas in the thousands place: %,.2f\n", price6);
        System.out.println(" ");
        //Parentheses showing negative numbers
        System.out.printf("Showing negative numbers using parentheses: %(.2f\n", price1);
        System.out.printf("Showing negative numbers using parentheses: %(.2f\n", price2);
        System.out.printf("Showing negative numbers using parentheses: %(.2f\n", price3);
        System.out.println(" ");
        //Using space to show positive numbers. (if there isn't a space, that means its negative)
        System.out.printf("Showing positive numbers using space % .2f\n", price1);
        System.out.printf("Showing positive numbers using space % .2f\n", price2);
        System.out.printf("Showing positive numbers using space % .2f\n", price3);
        System.out.println(" ");
        /*
        ALIGNING NUMBERS USING WIDTH METHODS

        0 = zero padding

        ZERO PADDING
         */
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        System.out.printf("Using zero padding to align numbers: %04d\n", id1); // Using zero, you zero pad the values, then add a number based on the maximum amount of numbers
        System.out.printf("Using zero padding to align numbers: %04d\n", id2);
        System.out.printf("Using zero padding to align numbers: %04d\n", id3);
        System.out.printf("Using zero padding to align numbers: %04d\n", id4);
        System.out.println(" ");
        /*
        NUMBER PADDING
         */

        // number = right justified padding (padding is on the right)
        System.out.printf("Using number padding to align numbers: %4d\n", id1);
        System.out.printf("Using number padding to align numbers: %4d\n", id2);
        System.out.printf("Using number padding to align numbers: %4d\n", id3);
        System.out.printf("Using number padding to align numbers: %4d\n", id4);
        System.out.println(" ");
        /*
        NEGATIVE NUMBER PADDING
         */

        // negative number = left justified padding (padding is on the left)
        System.out.printf("Using negative number padding to align numbers: %-4d\n", id1);
        System.out.printf("Using negative number padding to align numbers: %-4d\n", id2);
        System.out.printf("Using negative number padding to align numbers: %-4d\n", id3);
        System.out.printf("Using negative number padding to align numbers: %-4d\n", id4);

    }
}
