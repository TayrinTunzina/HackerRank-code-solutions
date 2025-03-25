import java.util.Scanner;

public class TimeInWords {
    public static String timeInWords(int h, int m) {
        String[] numbers = {"zero", "one", "two", "three", "four", 
                            "five", "six", "seven", "eight", "nine", 
                            "ten", "eleven", "twelve", "thirteen", 
                            "fourteen", "fifteen", "sixteen", 
                            "seventeen", "eighteen", "nineteen", 
                            "twenty", "twenty one", "twenty two", 
                            "twenty three", "twenty four", 
                            "twenty five", "twenty six", 
                            "twenty seven", "twenty eight", 
                            "twenty nine", "thirty"};
        
        if (m == 0) {
            return numbers[h] + " o' clock";
        } else if (1 <= m && m <= 30) {
            if (m == 1) {
                return numbers[m] + " minute past " + numbers[h];
            } else if (m == 15) {
                return "quarter past " + numbers[h];
            } else if (m == 30) {
                return "half past " + numbers[h];
            } else {
                return numbers[m] + " minutes past " + numbers[h];
            }
        } else {
            if (m == 45) {
                return "quarter to " + numbers[h + 1];
            } else {
                return numbers[60 - m] + " minutes to " + numbers[h + 1];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hour (1-12): ");
        int h = scanner.nextInt();
        System.out.print("Enter minutes (0-59): ");
        int m = scanner.nextInt();
        
        System.out.println(timeInWords(h, m));
        scanner.close();
    }
}