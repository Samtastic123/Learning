package Learning.Basics;

public class Array {
    public static void main(String[] args) {
        // Arrays are a collection of values of the same data type
        //                 in other words, it is a variable that can store more than 1 value

        String[] fruits = {"Banana", "Orange", "Apple", "Coconut"};

        //fruits[0] = "pineapple";
        //int numOfFruits = fruits.length;
        //Arrays.sort(fruits);
        //Arrays.fill(fruits, "pineapple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
