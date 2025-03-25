import java.util.Scanner;

public class MinMaxSum {

    public static void miniMaxSum(long[] arr) {
        long totalSum = 0;
        long minVal = Long.MAX_VALUE;
        long maxVal = Long.MIN_VALUE;

        for (long num : arr) {
            totalSum += num;
            if (num < minVal) minVal = num;
            if (num > maxVal) maxVal = num;
        }

        long minSum = totalSum - maxVal;
        long maxSum = totalSum - minVal;

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] arr = new long[5];

        System.out.print("Enter five positive integers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextLong();
        }

        miniMaxSum(arr);

        scanner.close();
    }
}