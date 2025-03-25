import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the five integers
        long[] numbers = new long[5];

        // Input: Five space-separated integers
        System.out.print("Enter five space-separated integers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextLong();
        }

        // Calculate the total sum of all numbers
        long totalSum = 0;
        for (long num : numbers) {
            totalSum += num;
        }

        // Find the minimum and maximum values in the array
        long minVal = Long.MAX_VALUE;
        long maxVal = Long.MIN_VALUE;
        for (long num : numbers) {
            if (num < minVal) minVal = num;
            if (num > maxVal) maxVal = num;
        }

        // Calculate the minimum and maximum sums
        long minSum = totalSum - maxVal;
        long maxSum = totalSum - minVal;

        // Output the result
        System.out.println(minSum + " " + maxSum);

        scanner.close();
    }
}