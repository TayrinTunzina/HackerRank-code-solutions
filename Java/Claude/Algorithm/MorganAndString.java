import java.util.Scanner;

public class MorganAndString {
    public static String morganAndString(String a, String b) {
        a = a + "z";  // Add sentinel characters
        b = b + "z";
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        
        while (i < a.length()-1 || j < b.length()-1) {
            if (a.substring(i).compareTo(b.substring(j)) <= 0) {
                result.append(a.charAt(i++));
            } else {
                result.append(b.charAt(j++));
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        
        while (t-- > 0) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            System.out.println(morganAndString(a, b));
        }
        
        scanner.close();
    }
}