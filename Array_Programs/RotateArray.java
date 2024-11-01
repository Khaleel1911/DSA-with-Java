import java.util.Scanner;
public class RotateArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int []a=new int[n];
        System.out.println("Enter Array Elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter K:");
        int k=sc.nextInt();
        System.out.println("Array aftrr rotation");
        
        //  New approach which i have learned
        RotateInPlace(a,k);


        /*
             my logic

            int i=0;
            int j=n-1;
            int temp;

            int noOfRotations=k%n;
            while(noOfRotations>=1){
                temp=a[j];
                for(k=j;k>0;k--){
                    a[k]=a[k-1];
                }
                a[i]=temp;
                noOfRotations--;
            }
         */

        

        for(int element:a){
            System.out.print(element+" ");
        }

    }

    static void RotateInPlace(int a[],int k){
        
        int n=a.length;
        k=k%n;
        reverse(a,0,n-k-1);
        reverse(a,n-k,n-1);
        reverse(a,0,n-1);
    }

    static void reverse(int a[],int i,int j){
        int temp;
        while(i<j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;j--;
        }
    }

}
