import java.util.HashMap;
import java.util.Scanner;

public class TimeInWords {
    public static String timeInWords(int h, int m) {
        // Map numbers to words
        HashMap<Integer, String> numToWords = new HashMap<>();
        numToWords.put(1, "one");
        numToWords.put(2, "two");
        numToWords.put(3, "three");
        numToWords.put(4, "four");
        numToWords.put(5, "five");
        numToWords.put(6, "six");
        numToWords.put(7, "seven");
        numToWords.put(8, "eight");
        numToWords.put(9, "nine");
        numToWords.put(10, "ten");
        numToWords.put(11, "eleven");
        numToWords.put(12, "twelve");
        numToWords.put(13, "thirteen");
        numToWords.put(14, "fourteen");
        numToWords.put(15, "quarter");
        numToWords.put(16, "sixteen");
        numToWords.put(17, "seventeen");
        numToWords.put(18, "eighteen");
        numToWords.put(19, "nineteen");
        numToWords.put(20, "twenty");
        numToWords.put(30, "half");

        if (m == 0) {
            return numToWords.get(h) + " o' clock";
        } else if (m <= 30) {
            if (m == 1) {
                return "one minute past " + numToWords.get(h);
            } else if (m == 15 || m == 30) {
                return numToWords.get(m) + " past " + numToWords.get(h);
            } else if (m <= 20) {
                return numToWords.get(m) + " minutes past " + numToWords.get(h);
            } else {
                return numToWords.get(20) + " " + numToWords.get(m - 20) + " minutes past " + numToWords.get(h);
            }
        } else {
            int remainingMinutes = 60 - m;
            int nextHour = (h < 12) ? h + 1 : 1;
            if (remainingMinutes == 1) {
                return "one minute to " + numToWords.get(nextHour);
            } else if (remainingMinutes == 15) {
                return "quarter to " + numToWords.get(nextHour);
            } else if (remainingMinutes <= 20) {
                return numToWords.get(remainingMinutes) + " minutes to " + numToWords.get(nextHour);
            } else {
                return numToWords.get(20) + " " + numToWords.get(remainingMinutes - 20) + " minutes to " + numToWords.get(nextHour);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the hour (1-12): ");
        int h = scanner.nextInt();
        System.out.print("Enter the minutes (0-59): ");
        int m = scanner.nextInt();

        System.out.println(timeInWords(h, m));
        scanner.close();
    }
}