import java.util.*;

public class MaxSubstringValue {

    public static int maxSubstringValue(String t) {
        int n = t.length();
        int max_value = 0;
        Map<String, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = t.substring(i, j + 1);
                freq.put(sub, freq.getOrDefault(sub, 0) + 1);
                max_value = Math.max(max_value, sub.length() * freq.get(sub));
            }
        }

        return max_value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        System.out.println(maxSubstringValue(t));
    }
}
