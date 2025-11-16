package Learning;

public class VarArgs {
    public static void main(String[] args){

        /* varargs = allows a method to except a varying number of arguments
                     makes methods more flexible, no need for overloaded methods
                     java will pack arguments into an array
                     (ellipsis)
                     ellipsis is (data type)... (variable)
         */
        System.out.println(average(1, 2, 3, 4, 5, 6));

    }

    static double average(double... numbers){

        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
