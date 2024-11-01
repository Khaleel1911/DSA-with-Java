/* Problem Statement:
    *Given an integer array 'a',return the prefix sum/running sum in the same array 
    without creating a new array.
 */
import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int []a=new int[n];
        int []ans=new int[n];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original array is: ");
        printArray(a);
    
        // my logic -- creating an extra array
        
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=0;j<=i;j++){
        //         sum+=a[j];
        //     }
        //     ans[i]=sum;
        // }
        
        // lecturer login --creating an extra array
        // ans[0]=a[0];
        // for(int i=1;i<n;i++){
        //     ans[i]=ans[i-1]+a[i];
        // }

        // lectured logic --without creating an extra array.
        
        for(int i=1;i<n;i++){
            a[i]+=a[i-1];
        }


        System.out.println(" ");
        System.out.println("Prefix Sum Array is:");
        printArray(a);
    }



    static void printArray(int a[]){
        for(int element:a){
            System.out.print(element+" ");
        }
    }
    
}
