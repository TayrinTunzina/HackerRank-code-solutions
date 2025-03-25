import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TimeInWords {
    public static String timeInWords(int h, int m) {
        Map<Integer, String> numToWords = new HashMap<>();
        numToWords.put(1, "one"); numToWords.put(2, "two"); numToWords.put(3, "three");
        numToWords.put(4, "four"); numToWords.put(5, "five"); numToWords.put(6, "six");
        numToWords.put(7, "seven"); numToWords.put(8, "eight"); numToWords.put(9, "nine");
        numToWords.put(10, "ten"); numToWords.put(11, "eleven"); numToWords.put(12, "twelve");
        numToWords.put(13, "thirteen"); numToWords.put(14, "fourteen"); numToWords.put(15, "quarter");
        numToWords.put(16, "sixteen"); numToWords.put(17, "seventeen"); numToWords.put(18, "eighteen");
        numToWords.put(19, "nineteen"); numToWords.put(20, "twenty"); numToWords.put(21, "twenty one");
        numToWords.put(22, "twenty two"); numToWords.put(23, "twenty three"); numToWords.put(24, "twenty four");
        numToWords.put(25, "twenty five"); numToWords.put(26, "twenty six"); numToWords.put(27, "twenty seven");
        numToWords.put(28, "twenty eight"); numToWords.put(29, "twenty nine"); numToWords.put(30, "half");

        if (m == 0) {
            return numToWords.get(h) + " o' clock";
        } else if (m == 1) {
            return "one minute past " + numToWords.get(h);
        } else if (1 < m && m <= 30) {
            if (m == 15 || m == 30) {
                return numToWords.get(m) + " past " + numToWords.get(h);
            } else {
                return numToWords.get(m) + " minutes past " + numToWords.get(h);
            }
        } else {
            int nextHour = (h % 12) + 1;
            if (m == 45) {
                return numToWords.get(60 - m) + " to " + numToWords.get(nextHour);
            } else {
                return numToWords.get(60 - m) + " minutes to " + numToWords.get(nextHour);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hour (1-12): ");
        int h = scanner.nextInt();
        System.out.print("Enter minute (0-59): ");
        int m = scanner.nextInt();
        System.out.println(timeInWords(h, m));
    }
}
