import java.util.Scanner;

public class MorganAndString {
    public static String morganAndString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.substring(i).compareTo(b.substring(j)) < 0) {
                result.append(a.charAt(i++));
            } else {
                result.append(b.charAt(j++));
            }
        }
        result.append(a.substring(i));
        result.append(b.substring(j));
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int T = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        for (int t = 0; t < T; t++) {
            System.out.print("Enter Jack's letters: ");
            String a = scanner.nextLine();
            System.out.print("Enter Daniel's letters: ");
            String b = scanner.nextLine();
            System.out.println(morganAndString(a, b));
        }
        scanner.close();
    }
}
