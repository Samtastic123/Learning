package Learning.ObjectOrientedProgramming.ObjectArrays;

public class ArraysOfObjects {
    public static void main(String[] args){


        Car[] cars = {new Car("Mustang", "red "),
                      new Car("Corvette", "blue "),
                      new Car("Charger", "yellow ")};

        for(Car car : cars){
            car.color = "black";
        }
        for(Car car : cars){
            car.drive();
        }

    }
}
