package Learning.Basics;

public class Methods {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when calling ()
        double result = square(3);
        System.out.println(cube(3));


        String name = "Sameer";
        int age = 11;
        if(ageCheck(age)){
            System.out.println("You may sign up");
        } else {
            System.out.println("You must be 18+ to sign up");
        }

        happyBirthday(name, age); //data type and parameters MUST be matching

    }
    static void happyBirthday(String birthdayBoy, int age){ //Methods are not able to use variables.
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", birthdayBoy);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy birthday to you\n");

        String fullName = getFullName("Spongebob", "Squarepants");
        System.out.println(fullName);

    }
    static double square(double number) {return number * number;}
        static double cube(double number){return number * number * number;}
    static String getFullName(String first, String last){return first + " " + last;}
    static boolean ageCheck(int age){
        if(age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
