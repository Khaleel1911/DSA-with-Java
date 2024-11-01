/*
 * Problem statement:
 *  Given an unsorted array arr of positive integers. One number a from the set [1, 2,....,n] is missing and one number b occurs twice in the array. Find numbers a and b.

    Note: The test cases are generated such that there always exists one missing and one repeating number within the range [1,n].

    Input: arr[] = [4, 3, 6, 2, 1, 1]
    Output: [1, 5]
    Explanation: Repeating number is 1 and the missing number is 5.
 */
import java.util.Scanner;

public class MissingAndRepeating {

    public static void main(String[] args) {
        // mySolution
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create an array to track frequencies
        int[] frequency = new int[n + 1];

        for (int i = 0; i < n; i++) {
            frequency[arr[i]]++;
        }

        int missing = -1;
        int duplicate = -1;

        for (int i = 1; i <= n; i++) {
            if (frequency[i] == 0) {
                missing = i; // If frequency is 0, it's missing
            }
            if (frequency[i] > 1) {
                duplicate = i; // If frequency is greater than 1, it's a duplicate
            }
        }
        System.out.print(duplicate + "  " + missing);
    }

}
