/*
* Created as a test to IntelliJ
* This is looking good
*/
import java.util.*;

public class TestOne {
    public static void main(String [] args){
        int array[] = new int[10];
        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            int number = random.nextInt();
            array[i] = number;//(int)(Math.random()*100);
            System.out.print(array[i] + " ");
        }

        int print = getMin(array);

        System.out.println("\n Index of integer(s) closest to zero: ");
        int matchVar = match(array, print);
    }

    private static int match(int [] array, Integer print) {
        int i = 0;

        for(i = 0; i < array.length - 1; i++){
            if(Math.abs(print) == Math.abs(array[i]))
                System.out.print(i + " ");
        }
        return i;
    }

    public static int getMin(int [] array) {

        int min = array[0];

        for (int i = 1; i < (array.length); i++) {
            if (Math.abs(array[i]) < Math.abs(min)) {
                min = array[i];
            }
        }
        return min;
    }
}
