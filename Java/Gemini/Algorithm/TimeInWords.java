import java.util.Scanner;

public class TimeInWords {

    public static String numberToWord(int num) {
        String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty"};

        if (num < 20) {
            return units[num];
        } else {
            return tens[num / 10] + (num % 10 > 0 ? " " + units[num % 10] : "");
        }
    }

    public static String timeInWords(int h, int m) {
        if (m == 0) {
            return numberToWord(h) + " o' clock";
        } else if (m <= 30) {
            if (m == 15) {
                return "quarter past " + numberToWord(h);
            } else if (m == 30) {
                return "half past " + numberToWord(h);
            } else {
                return numberToWord(m) + " minutes past " + numberToWord(h);
            }
        } else {
            if (m == 45) {
                return "quarter to " + numberToWord(h + 1);
            } else {
                return numberToWord(60 - m) + " minutes to " + numberToWord(h + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the hour (1-12): ");
        int h = scanner.nextInt();

        System.out.print("Enter the minutes (0-59): ");
        int m = scanner.nextInt();

        String result = timeInWords(h, m);
        System.out.println(result);
    }
}
