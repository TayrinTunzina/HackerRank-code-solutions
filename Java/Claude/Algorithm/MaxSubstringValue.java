import java.util.*;

public class MaxSubstringValue {
    static int calculate_f(String s, String t) {
        int count = 0;
        for(int i = 0; i <= t.length() - s.length(); i++) {
            if(t.substring(i, i + s.length()).equals(s)) {
                count++;
            }
        }
        return s.length() * count;
    }
    
    static int stringFunction(String t) {
        int n = t.length();
        int max_value = 0;
        
        // Generate all possible substrings
        for(int length = 1; length <= n; length++) {
            // Use set to avoid duplicate substrings
            Set<String> substrings = new HashSet<>();
            for(int i = 0; i <= n - length; i++) {
                substrings.add(t.substring(i, i + length));
            }
            
            // Calculate f(s) for each unique substring
            for(String s : substrings) {
                int value = calculate_f(s, t);
                max_value = Math.max(max_value, value);
            }
        }
        
        return max_value;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine().trim();
        System.out.println(stringFunction(t));
        scanner.close();
    }
}