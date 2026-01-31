package Learning.ObjectOrientedProgramming.Constructors;

public class OverloadedConstructors {
    public static void main(String[] args){

        /* overloaded constructors = Allow a class to have multiple constructors
                                     with different parameter lists.
                                     Enable objects to be initialized in various ways.
         */

        User user1 = new User("Spongebob");
        User user2 = new User("Patrick", "potrick@gmail.com");
        User user3 = new User("Sandy","bigS@gmail.com", 29);
        User user4 = new User();

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

    }
}
