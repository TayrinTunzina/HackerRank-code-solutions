import java.util.Scanner;

public class TimeInWords {
    public static String timeInWords(int h, int m) {
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                         "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                         "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three",
                         "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"};

        if (m == 0) {
            return nums[h] + " o' clock";
        } else if (m == 15) {
            return "quarter past " + nums[h];
        } else if (m == 30) {
            return "half past " + nums[h];
        } else if (m == 45) {
            return "quarter to " + nums[(h % 12) + 1];
        } else if (m < 30) {
            return nums[m] + " minutes past " + nums[h];
        } else {
            return nums[60 - m] + " minutes to " + nums[(h % 12) + 1];
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
