package Learning.ObjectOrientedProgramming.Super;

public class Main {
    public static void main(String[] args){

        /*
        super = Refers to the parent class (subclass <- superclass)
                Used in constructors and method overriding
                Calls the parent constructor to initialize attributes
         */

        Person person = new Person("Harry", "Potter");
        person.showName();

        Student student = new Student("Percy", "Jackson", 1.2);
        student.showGpa();

        Employee employee = new Employee("Annabeth", "Chase", 50000);
        employee.showSalary();

    }
}
