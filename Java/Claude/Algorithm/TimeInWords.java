import java.util.Scanner;

public class TimeInWords {
    static String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", 
                             "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", 
                             "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", 
                             "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", 
                             "twenty seven", "twenty eight", "twenty nine", "half"};
    
    public static String timeInWords(int h, int m) {
        if (m == 0)
            return numbers[h] + " o' clock";
        else if (m == 1)
            return "one minute past " + numbers[h];
        else if (m == 15)
            return "quarter past " + numbers[h];
        else if (m == 30)
            return "half past " + numbers[h];
        else if (m == 45)
            return "quarter to " + numbers[h + 1];
        else if (m < 30)
            return numbers[m] + " minutes past " + numbers[h];
        else
            return numbers[60 - m] + " minutes to " + numbers[h + 1];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(timeInWords(h, m));
        scanner.close();
    }
}