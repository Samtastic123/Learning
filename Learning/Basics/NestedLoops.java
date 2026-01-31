package Learning.Basics;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        // nested loop= loop inside another loop
        //    often used with matrics or DS&A

       /* for(int i = 1; i <= 3; i++){
            for(int j =1; j  <= 9; j++)  {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        EXAMPLE ^^^
        */

        int rows;
        int columns;
        char symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);


        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }



        scanner.close();




    }
}
