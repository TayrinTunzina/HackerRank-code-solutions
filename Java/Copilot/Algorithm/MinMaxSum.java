import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {
    public static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long min_sum = (long) arr[0] + arr[1] + arr[2] + arr[3];
        long max_sum = (long) arr[1] + arr[2] + arr[3] + arr[4];
        System.out.println(min_sum + " " + max_sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter five positive integers separated by space: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        if (arr.length == 5) {
            miniMaxSum(arr);
        } else {
            System.out.println("Please enter exactly five positive integers.");
        }
        scanner.close();
    }
}
