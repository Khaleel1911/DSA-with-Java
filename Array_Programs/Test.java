import java.util.Scanner;
public class Test {
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
        
        for(int element:a){
            System.out.print(element+" ");
        }
    }
}
