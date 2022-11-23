import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {

        int[] numbersArr = new int[10];
        Random rand = new Random();
        int max = 0;
        int min = 0;
        //populate array with 10 random numbers (upper limit 10)
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(10) + 1;
            numbersArr[i] = num;
        }
        //Print each value in array to screen
        for (int num : numbersArr) {
            System.out.println(num);
        }

        for (int i = 0; i < 10; i++) {
            //assign first value in array as max
            if (i == 0) {
                max = numbersArr[i];
            }
            //assign second value in array as min
            else if (i == 1) {
                min = numbersArr[i];
            }
            //swap values if max was smaller than min
            if (max < min) {
                int tempMax = max;
                max = min;
                min = tempMax;
            }
            //as array loops if any value is larger than initial max then update max
            if (numbersArr[i] > max) {
                max = numbersArr[i];
            }
            //as array loops if any value is smaller than initial min then update min
            if (numbersArr[i] < min) {
                min = numbersArr[i];
            }
        }
        System.out.println("max value is: " + max);
        System.out.println("min value is: " + min);

//        System.out.println("max value = " + Arrays.stream(numbersArr).max().getAsInt()); built in methods
//        System.out.println("min value = " + Arrays.stream(numbersArr).min().getAsInt());
    }
}
