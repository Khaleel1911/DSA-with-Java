/*
 * Problem Statement:
 * Check if we can partition the array into two subarrays with equal sum.
 * More formally, check that the prefix sum of a part of the array is
 * equal to the suffix sum of rest of the array.
 */

import java.util.Scanner;
public class PartititonSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        // int pref[]=makePrefixSum(arr);  mylogic code
        // int suff[]=makeSuffixSum(arr);
        

        // System.out.println(findPartition(pref,suff));  mylogic code
        System.out.println(findPartition(arr));
    }

    // lecturer logic

    static boolean findPartition(int[]a ){
        int totalsum=findArraySum(a);
        int pref=0;
        for(int i=0;i<a.length;i++){
            pref+=a[i];
            int suf=totalsum-pref;
            if(pref==suf){
                return true;
            }
        }
        return false;
    }

    static int findArraySum(int a[]){
        int totalsum=0;
        for(int i=0;i<a.length;i++){
            totalsum+=a[i];
        }
        return totalsum;
    }



    /* 
        ------mylogic-------
    static boolean findPartition(int pref[],int suff[]){
            int n=pref.length;
            for(int i=0;i<n-1;i++){
                if(pref[i]==suff[i+1]){
                    return true;
                }
            }

        return false;
    }

    static int[] makePrefixSum(int a[]){
        int pref[]=new int[a.length];
        pref[0]=a[0];
        for(int i=1;i<a.length;i++){
            pref[i]=a[i]+pref[i-1];
        }
        return pref;
    }
    static int[] makeSuffixSum(int a[]){
        int n=a.length;
        int pref[]=new int[a.length];
        pref[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            pref[i]=a[i]+pref[i+1];
        }
        return pref;
    }
*/
    static void printArray(int a[]){
        for(int element:a){
            System.out.print(element+" ");
        }
        System.out.println(" ");
    }
}
