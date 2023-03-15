package Practice;

import java.util.Arrays;

public class Exam2 {
    public static void main(String[] args) {
        //Write java solution to find the lowest number from this array. int array[] = {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        //If i add another number here just to see if it works : lets add 2
        int array[] = {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

        Arrays.sort(array);

        for(int x =0; x< array.length; x++)
        {
            System.out.print(array[x]+ " ");
        }
//        System.out.println(" ");
//        System.out.println(" ");
//        System.out.println("Lowest number is "+ array[0] );

    }
}
