package Learning;

public class TernaryOperator {
    public static void main(String[] args) {

        // ternary operator (?) = return 1 of 2 value if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        int score = 70;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL"; // Colon means otherwise
        System.out.println(passOrFail);

        int number = 4;

        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);

        int hours = 13;

        String TimeOfDay = (hours < 12) ? "AM" : "PM";
        System.out.println(TimeOfDay);

        int income = 60000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}
