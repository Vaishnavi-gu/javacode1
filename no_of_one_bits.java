import java.util.*;

public class no_of_one_bits {

    public static int hammingWeight(int n) {

        int count = 0;

        while (n != 0) {

            count += n & 1;

            n >>>= 1;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(hammingWeight(n));
        sc.close();
    }
    
}