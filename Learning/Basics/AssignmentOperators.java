package Learning.Basics;

public class AssignmentOperators {
    public static void main(String[] args) {
        /* ASSIGNMENT OPERATORS */

        // Regular Assignment is (=) sign
        int mana = 100;
        System.out.println("Mana: " + mana);
        // Addition (+=)
        mana += 20;
        System.out.println("Mana: " + mana);

        mana++; //(++) means plus 1
        System.out.println("Mana: " + mana);

        //Subtraction (-=)
        mana -= 60;
        System.out.println("Mana: " + mana);

        mana--; // Subtract 1
        System.out.println("Mana: " + mana);

        //Multiply (*=)
        mana *= 2;
        System.out.println("Mana: " + mana);

        //Divide (/=)
        mana /= 4;
        System.out.println("Mana: " + mana);

        // Modulo (REMAINDER) %=
        mana %= 2;
        System.out.println("Mana: " + mana);
    }
}
