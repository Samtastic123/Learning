package Learning.ObjectOrientedProgramming.Constructors;

public class Student {

    String name = "Spongebob";
    int age;
    double GPA;
    boolean isEnrolled;


    Student(String name, int age, double GPA){
        this.name = name;
        this.age  = age;
        this.GPA = GPA;
        this.isEnrolled = true;
    }
    void study(){
        System.out.println(this.name + " is studying");
    }
}
