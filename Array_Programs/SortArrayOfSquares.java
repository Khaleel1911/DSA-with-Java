/* 
 * Problem statement:
 
    Given an integer array 'a' sorted in non-decreasing
    order, rturn an array of the squares of each number
    sorted in non-decreasing order.

*/

import java.util.Scanner;

public class SortArrayOfSquares{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        
        int n=sc.nextInt();
        int []a=new int[n];
        int []ans=new int[n];
        System.out.println("Enter array Elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Original array is: ");
        printArray(a);


        // Two pointer approach

        int i=0;
        int j=n-1;
        int k=n-1; //for traversing the ans array.

        while(i<=j){
            if(Math.abs(a[i])>Math.abs(a[j])){
                ans[k--]=a[i]*a[i];
                i++;
            }else{
                ans[k--]=a[j]*a[j];
                j--;
            }
            
        }




        System.out.println("");
        System.out.println("Sorted Squares Array is:");
        printArray(ans);
    }

    static void printArray(int a[]){
        for(int element:a){
            System.out.print(element+" ");
        }
    }
}