import java.util.*;

public class MorganAndString {

    public static String morganAndString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) < b.charAt(j)) {
                result.append(a.charAt(i++));
            } else if (a.charAt(i) > b.charAt(j)) {
                result.append(b.charAt(j++));
            } else { // If letters are equal, choose the shorter string
                if (a.substring(i).compareTo(b.substring(j)) < 0) {
                    result.append(a.charAt(i++));
                } else {
                    result.append(b.charAt(j++));
                }
            }
        }

        result.append(a.substring(i));
        result.append(b.substring(j));

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < t; i++) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            System.out.println(morganAndString(a, b));
        }
    }
}