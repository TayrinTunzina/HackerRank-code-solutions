import java.util.Scanner;

public class TimeInWords {
    static String timeInWords(int h, int m) {
        String[] words = {
                "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
                "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine"
        };

        if (m == 0) return words[h] + " o' clock";
        if (m == 1) return "one minute past " + words[h];
        if (m == 15) return "quarter past " + words[h];
        if (m == 30) return "half past " + words[h];
        if (m == 45) return "quarter to " + words[h + 1];
        if (m < 30) return words[m] + " minutes past " + words[h];
        return words[60 - m] + " minutes to " + words[h + 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        System.out.println(timeInWords(h, m));
    }
}
