import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to hold the five integers
        long[] numbers = new long[5];

        // Read five integers from the user
        System.out.println("Enter five positive integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextLong();
        }

        // Sort the array
        Arrays.sort(numbers);

        // Calculate the minimum sum (sum of the first four numbers)
        long minSum = numbers[0] + numbers[1] + numbers[2] + numbers[3];

        // Calculate the maximum sum (sum of the last four numbers)
        long maxSum = numbers[1] + numbers[2] + numbers[3] + numbers[4];

        // Print the results
        System.out.println(minSum + " " + maxSum);
    }
}
