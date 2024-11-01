// Array manipulation
// Finding the second maximum element in the array by using *Array Manupulation Approach*
import java.util.Scanner;

public class Second_Max {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Second Maximum Element is:  ");
        System.out.println(find_second_max(arr));

    }

    static int find_second_max(int arr[]) {
        int max = find_max(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return find_max(arr);
    }

    static int find_max(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
