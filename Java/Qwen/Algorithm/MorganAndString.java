import java.util.Scanner;

public class MorganAndString {
    public static String morganAndString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        int n = a.length(), m = b.length();
        
        while (i < n && j < m) {
            if (a.substring(i).compareTo(b.substring(j)) < 0) {
                result.append(a.charAt(i));
                i++;
            } else {
                result.append(b.charAt(j));
                j++;
            }
        }
        
        // Append remaining characters from either string
        result.append(a.substring(i));
        result.append(b.substring(j));
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        while (t-- > 0) {
            System.out.print("Enter Jack's collection: ");
            String a = scanner.nextLine();
            System.out.print("Enter Daniel's collection: ");
            String b = scanner.nextLine();
            
            System.out.println(morganAndString(a, b));
        }
        
        scanner.close();
    }
}