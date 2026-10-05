import java.util.*;

public class count_digits {

    public static int countDigits(int num) {

        int original = num;
        int count = 0;

        while (num > 0) {

            int digit = num % 10;

            if (original % digit == 0) {
                count++;
            }

            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(countDigits(num));
    }
}