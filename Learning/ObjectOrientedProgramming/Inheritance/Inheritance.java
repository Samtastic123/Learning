package Learning.ObjectOrientedProgramming.Inheritance;

public class Inheritance {
    public static void main(String[] args){

        /* Inheritance = One class inherits the attributes and methods
                         from another class
                         Child <- Parent <- Grandparent
         */

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(plant.isAlive);

        plant.photosynthesize();



    }
}
