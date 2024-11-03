import java.util.Scanner;

public class SuffixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        System.out.println("Original array is:");
        printarray(a);
        System.out.println("Suffix Sum array");
        findSufSum(a);
        printarray(a);
        
        
    }
    
    // calculating suffix sum 
    static void findSufSum(int []a){
        int n=a.length;
        for(int i=n-2;i>=0;i--){
            a[i]+=a[i+1];
        }
        
    }

    static void printarray(int a[]){
        for(int element:a){
            System.out.print(element+" ");
        }
        System.out.println(" ");
    }
}
