import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxSubstringValue {
    public static int maxFValue(String t) {
        int n = t.length();
        int maxValue = 0;

        // Dictionary to store the count of each substring
        Map<String, Integer> substringCount = new HashMap<>();

        // Generate all substrings and count their occurrences
        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                String substring = t.substring(i, j + 1);
                substringCount.put(substring, substringCount.getOrDefault(substring, 0) + 1);
            }
        }

        // Calculate the maximum value of f(s)
        for (Map.Entry<String, Integer> entry : substringCount.entrySet()) {
            maxValue = Math.max(maxValue, entry.getKey().length() * entry.getValue());
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string t: ");
        String t = scanner.nextLine();
        System.out.println(maxFValue(t));
        scanner.close();
    }
}
