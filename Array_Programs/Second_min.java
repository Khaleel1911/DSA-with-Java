// Array manipulation
// Finding the second minimum element in the array by using *Array Manupulation Approach*

import java.util.Scanner;

public class Second_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Second Minimum Element is:  ");
        System.out.println(find_second_min(arr));

    }

    static int find_second_min(int arr[]) {
        int min = find_min(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                arr[i] = Integer.MAX_VALUE;
            }
        }
        return find_min(arr);
    }

    static int find_min(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
