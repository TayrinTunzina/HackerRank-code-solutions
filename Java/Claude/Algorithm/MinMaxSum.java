import java.util.Arrays;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MinMaxSum {
    public static void minMaxSum(int[] arr) {
        if (arr.length != 5) {
            throw new IllegalArgumentException("Array must contain exactly 5 integers");
        }
        
        // Convert to long and validate
        long[] longArr = Arrays.stream(arr)
            .mapToLong(i -> {
                if (i <= 0) throw new IllegalArgumentException("All numbers must be positive");
                return i;
            })
            .toArray();
        
        // Sort the array
        Arrays.sort(longArr);
        
        long min_sum = 0;
        long max_sum = 0;
        
        // Calculate sums
        for(int i = 0; i < 4; i++) min_sum += longArr[i];
        for(int i = 1; i < 5; i++) max_sum += longArr[i];
        
        // Format output
        NumberFormat formatter = NumberFormat.getInstance(Locale.US);
        System.out.println("Input array: " + Arrays.toString(arr));
        System.out.println("Minimum sum (using first 4 numbers): " + formatter.format(min_sum));
        System.out.println("Maximum sum (using last 4 numbers): " + formatter.format(max_sum));
        System.out.println("\nResult: " + min_sum + " " + max_sum);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        
        try {
            System.out.println("Enter 5 positive integers (one per line):");
            
            // Read 5 integers from user input
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number " + (i+1) + ": ");
                arr[i] = scanner.nextInt();
            }
            
            minMaxSum(arr);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter positive integers only.");
        } finally {
            scanner.close();
        }
    }
}