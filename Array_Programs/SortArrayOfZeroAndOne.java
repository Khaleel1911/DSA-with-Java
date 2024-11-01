// Sort the array consisting of 0's and 1's.

import java.util.Scanner;
public class SortArrayOfZeroAndOne {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("Enter array Elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        /* 

        basic logic..
         
        int count=0;
        for(int Element:a){
            if(Element==0){
                count++;
            }
        }
        
        for(int i=0;i<n;i++){
            if(i<count){
                
                a[i]=0;
            }
            else{
                a[i]=1;
            }
        }
        */


        // Using two pointer approach.
        // In single traversal we are sorting the array.
        int i=0;
        int j=n-1;
        while(i<j){
            if(a[i]==1 && a[j]==0){
                swap(a,i,j);
                i++;
                j--;
            }
            if(a[i]==0){
                i++;
            }
            if(a[j]==1){
                j--;
            }
        }
        
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
