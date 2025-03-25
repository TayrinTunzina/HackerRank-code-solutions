import java.util.*;

public class MaxSubstringValue {
    public static int maxFValue(String t) {
        int n = t.length();
        int maxF = 0;

        for (int length = 1; length <= n; length++) {
            Map<String, Integer> substringCount = new HashMap<>();

            // Sliding window to count substrings of length `length`
            for (int i = 0; i <= n - length; i++) {
                String substring = t.substring(i, i + length);
                substringCount.put(substring, substringCount.getOrDefault(substring, 0) + 1);
            }

            // Calculate f(s) and track max
            for (int count : substringCount.values()) {
                maxF = Math.max(maxF, length * count);
            }
        }

        return maxF;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        System.out.println(maxFValue(t));
    }
}
