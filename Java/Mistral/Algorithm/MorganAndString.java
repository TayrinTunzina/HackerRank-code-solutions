import java.util.Scanner;

public class MorganAndString {

    public static String morganAndString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < a.length() && j < b.length()) {
            if (a.substring(i).compareTo(b.substring(j)) < 0) {
                result.append(a.charAt(i));
                i++;
            } else if (a.substring(i).compareTo(b.substring(j)) > 0) {
                result.append(b.charAt(j));
                j++;
            } else {
                int k = 0;
                while (i + k < a.length() && j + k < b.length() && a.charAt(i + k) == b.charAt(j + k)) {
                    k++;
                }
                if (i + k == a.length()) {
                    result.append(b.charAt(j));
                    j++;
                } else if (j + k == b.length()) {
                    result.append(a.charAt(i));
                    i++;
                } else {
                    if (a.charAt(i + k) < b.charAt(j + k)) {
                        result.append(a.charAt(i));
                        i++;
                    } else {
                        result.append(b.charAt(j));
                        j++;
                    }
                }
            }
        }

        result.append(a.substring(i));
        result.append(b.substring(j));

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] results = new String[t];
        for (int i = 0; i < t; i++) {
            System.out.print("Enter string a: ");
            String a = scanner.nextLine();
            System.out.print("Enter string b: ");
            String b = scanner.nextLine();
            results[i] = morganAndString(a, b);
        }

        for (String result : results) {
            System.out.println(result);
        }

        scanner.close();
    }
}
