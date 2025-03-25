import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five space-separated integers:");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(arr);
        long minSum = 0;
        long maxSum = 0;

        for (int i = 0; i < 4; i++) {
            minSum += arr[i];
        }

        for (int i = 1; i < 5; i++) {
            maxSum += arr[i];
        }

        System.out.println(minSum + " " + maxSum);
    }
}
