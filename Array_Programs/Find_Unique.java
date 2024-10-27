// Find the unique number in a given Array where all 
// all the elements are beign repeated twice with one value being unique.

import java.util.Scanner;

public class Find_Unique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        find_unique_element(arr);
    }


    static void find_unique_element(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[i]=0;
                    a[j]=0;
                }
            }
        }
        for(int element:a){
            if(element!=0){
                System.out.println("Unique Element is: ");
                System.out.print(element);
            }
        }
    }
}
