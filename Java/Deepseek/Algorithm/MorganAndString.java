import java.util.Scanner;

public class MorganAndString {

    public static String morganAndString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.substring(i).compareTo(b.substring(j)) < 0) {
                result.append(a.charAt(i));
                i++;
            } else {
                result.append(b.charAt(j));
                j++;
            }
        }
        // Append the remaining characters
        result.append(a.substring(i));
        result.append(b.substring(j));
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("Enter Jack's letters: ");
            String a = scanner.next();
            System.out.print("Enter Daniel's letters: ");
            String b = scanner.next();
            // Output
            System.out.println(morganAndString(a, b));
        }

        scanner.close();
    }
}