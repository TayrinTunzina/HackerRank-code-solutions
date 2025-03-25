import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        long minSum = 0, maxSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += arr[i];
            maxSum += arr[arr.length - 1 - i];
        }

        System.out.println(minSum + " " + maxSum);
    }
}
