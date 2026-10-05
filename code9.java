
import java.util.Arrays;
import java.util.Scanner;

public class code9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements (including zeros):");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("\nOriginal Array: " + Arrays.toString(arr));
        int writePointer = 0;
        for (int readPointer = 0; readPointer < arr.length; readPointer++) {
            if (arr[readPointer] != 0) {
                arr[writePointer] = arr[readPointer];
                writePointer++;
            }
        }
        while (writePointer < arr.length) {
            arr[writePointer] = 0;
            writePointer++;
        }

        System.out.println("Modified Array: " + Arrays.toString(arr));
    }
}
