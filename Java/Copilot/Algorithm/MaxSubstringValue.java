import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxSubstringValue {
    public static int max_value(String t) {
        int n = t.length();
        Map<String, Integer> count = new HashMap<>();

        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                String s = t.substring(i, j + 1);
                count.put(s, count.getOrDefault(s, 0) + 1);
            }
        }

        int max_f = 0;
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            int f_s = entry.getKey().length() * entry.getValue();
            max_f = Math.max(max_f, f_s);
        }

        return max_f;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String t = scanner.nextLine();
        System.out.println(max_value(t));
        scanner.close();
    }
}
