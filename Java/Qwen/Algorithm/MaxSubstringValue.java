import java.util.HashMap;
import java.util.Scanner;

public class MaxSubstringValue {
    public static int maxFValue(String t) {
        int n = t.length();
        int maxValue = 0;
        HashMap<String, Integer> freqMap = new HashMap<>();

        // Sliding window to generate all substrings
        for (int i = 0; i < n; ++i) {
            StringBuilder substring = new StringBuilder();
            for (int j = i; j < n; ++j) {
                substring.append(t.charAt(j));
                String sub = substring.toString();
                freqMap.put(sub, freqMap.getOrDefault(sub, 0) + 1);
                int f_s = sub.length() * freqMap.get(sub);
                maxValue = Math.max(maxValue, f_s);
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        System.out.println(maxFValue(t));
    }
}