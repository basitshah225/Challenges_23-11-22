import java.util.ArrayList;
import java.util.Random;

public class Duplicates {
    public static void main (String[] args) {

        Random rand = new Random();
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        //populate both arrays with random numbers from 1 to 20
        for (int i = 0; i < 10; i++) {
            array1[i] = rand.nextInt(20) + 1;
            array2[i] = rand.nextInt(20) + 1;
        }
        //print both arrays on separate lines
        for (int num : array1) {
            System.out.print(num + ", ");
        }
        System.out.println();
        for (int num : array2) {
            System.out.print(num + ", ");
        }
        System.out.println();
        System.out.println("the numbers below are duplicated in both arrays: ");
        //loop through both arrays checking for duplicates
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //only add unique values to duplicates arraylist
                if (array2[j] == array1[i] && !duplicates.contains(array1[i])) {
                    duplicates.add(array1[i]);
                }
            }
        }
        //print contents of duplicates arraylist
        for (int num : duplicates)
        {
            System.out.print(num + ", ");
        }
    }
}
