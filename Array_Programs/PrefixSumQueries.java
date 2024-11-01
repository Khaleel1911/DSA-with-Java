/*
 * Problem statement:
 * 
 * Given an array of integers of  size n. Answer  q queries where you need to print the 
 * sum of values in a given range of indices from l to r (both included).
 * Note : The values of l and r in queries follow 1-bases indexing.
 */

import java.util.Scanner;

public class PrefixSumQueries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        System.out.println("Enter " + n + " elements:");

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("Enter number of Queries: ");
        int q = sc.nextInt();

        /*

        mylogic which traverse the array for each query.
         
        int range[]=new int[2];
        while(q>0){
            
            System.out.println("Enter range:");
            for(int i=0;i<2;i++){
                range[i]=sc.nextInt();
            }
            System.out.println("Sum is : "+ calculatePrefixSum(a,range[0],range[1]));
            --q;
        }
    }


    static int calculatePrefixSum(int a[],int i,int j){
        int sum=0;
        for(int k=i;k<=j;k++){
            sum+=a[k];
        }
        
        return sum;
    }

         */
 /*      lecturer approch create an prefix sum array and follwo the formula.
        sum of range 2 to 4 can be obtained by 
        p[2-4]=p[1-4]-p[1] like this           */
        int[] prefSum = makePrefixSumArray(a);

        while (q-- > 0) {
            System.out.println("Enter Range:");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefSum[r] - prefSum[l - 1];
            System.out.println("Sum  " + ans);
        }

    }

    static int[] makePrefixSumArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    static void printArray(int a[]) {
        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
