import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {

        int sum = 0;
        double average;
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        //sum = Arrays.stream(numbers).sum(); built in method

        //loop through array adding each number to the total;
        for (int num: numbers) {
            sum = sum + num;
        }
        //cast int sum to double for accurate result
        average = (double)sum/ numbers.length;
        //print results to screen
        System.out.println("sum = " + sum);
        System.out.println("Average = " + average);

    }
}
