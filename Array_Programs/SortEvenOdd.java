// Given an array of integers 'a',move all the even
// integers at the begining of the array followed by all the odd integers.
// The relative order of odd or even integers does not matter.
// Return any array that satisfies the condition.

import java.util.Scanner;

public class SortEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("Enter array Elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Original array is: ");
        printArray(a);

        // Two pointer approach

        int i=0;
        int j=a.length-1;
        while(i<j){
            if(a[i]%2!=0 && a[j]%2==0){
                swap(a,i,j);
            }
            if(a[i]%2==0){
                i++;
            }
            if(a[j]%2!=0){
                j--;
            }
        }
        System.out.println("");
        System.out.println("Sorted Array is:");
        printArray(a);
    }




    static void printArray(int a[]){
        for(int element:a){
            System.out.print(element+" ");
        }
    }

    static void swap(int []a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
