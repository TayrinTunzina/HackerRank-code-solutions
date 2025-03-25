import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxSubstringValue {
    public static long maxFValue(String t) {
        long maxValue = 0;
        int n = t.length();

        // Iterate over all possible substring lengths
        for (int length = 1; length <= Math.min(n, 100); length++) { // Limit length to avoid timeouts
            Map<String, Integer> freq = new HashMap<>();

            // Use a sliding window to count occurrences of substrings of current length
            for (int i = 0; i <= n - length; i++) {
                String substring = t.substring(i, i + length);
                freq.put(substring, freq.getOrDefault(substring, 0) + 1);
            }

            // Calculate f(s) for each substring of current length
            for (Map.Entry<String, Integer> entry : freq.entrySet()) {
                long currentValue = length * entry.getValue();
                if (currentValue > maxValue) {
                    maxValue = currentValue;
                }
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string t: ");
        String t = scanner.nextLine().trim();

        System.out.println("Maximum value of f(s): " + maxFValue(t));
    }
}