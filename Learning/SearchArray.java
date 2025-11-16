package Learning;

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean isFound = false;

        int[] numbers = {1, 5, 2, 7, 3, 8};
        String[] fruits = {"banana", "orange", "apple"};

        System.out.print("Enter a fruit to search for: ");
        String target = scanner.nextLine();

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in the array");
        }
        scanner.close();
    }
}
