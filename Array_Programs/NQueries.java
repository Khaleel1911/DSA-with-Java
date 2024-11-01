// problem statement:
//  Given Q queries, check if the given number is present in the array or not:
// Note: value of all the elements in the array is less than 1o to the power5  :: it is a hint to create the frequency array.

// Learning the approach of "Frequency table"

import java.util.Scanner;

public class NQueries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array Elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] frequencyArray = new int[100000];

        for (int i = 0; i < n; i++) {
            frequencyArray[a[i]]++;
        }

        System.out.println("Enter number of Quries:");
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            System.out.println("Enter number to be searched:");
            int key = sc.nextInt();
            if (frequencyArray[key] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
