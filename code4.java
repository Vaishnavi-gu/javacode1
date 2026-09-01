
import java.util.*;

public class code4 {

    public static void main(String[] args) {
        System.out.println("number is: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String word = sc.nextLine();
        int remainder, reversed = 0;
        while (num != 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = num / 10;
        }
        System.out.println("new number is: " + reversed);
        String revword = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            revword += word.charAt(i);
        }
        System.out.println("new string is: " + revword);
    }
}
