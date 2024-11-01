// Problem statement:
// Given an array 'a' consisting of intergers. Return the Last value that is repeating
// in this array. If no value is being repeated, return -1.

import java.util.Scanner;

public class LastRepValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Last repeted value is:  ");
        System.out.print(find_last_rep(arr));
    }

    static int find_last_rep(int arr[]){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    index=arr[i];
                }
            }
        }
        return index;
    }
}
