import java.util.Arrays;
import java.util.Scanner;

public class ExistInArray {
    public static void main (String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        boolean valInArr = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        //read user keyboard input
        int userInput = input.nextInt();
        //Loop through array and if value is equal to user input turn boolean value to true
        for (int num: numbers) {
            if (num == userInput) {
                valInArr = true;
                System.out.println("Value " + num + " found in array");
                break;
            }
        }
        if (valInArr == false) {
            System.out.println("Value was not found in array");
        }
    }
}
