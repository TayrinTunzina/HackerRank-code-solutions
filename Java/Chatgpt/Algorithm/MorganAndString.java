import java.util.*;

public class MorganAndString {
    public static String morganAndString(String a, String b) {
        a += "Z";  // Sentinel character
        b += "Z";
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < a.length() - 1 || j < b.length() - 1) {
            if (a.substring(i).compareTo(b.substring(j)) <= 0) {
                result.append(a.charAt(i++));
            } else {
                result.append(b.charAt(j++));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); 
        while (t-- > 0) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            System.out.println(morganAndString(a, b));
        }
        sc.close();
    }
}
