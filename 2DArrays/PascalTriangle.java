import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
         System.out.println("Enter n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][];

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         if(i==j || j==0){
        //             a[i][j]=1;
        //         }
        //         else{
        //             a[i][j]=a[i-1][j-1]+a[i-1][j];
        //         }
        //     }
        // }
        findPascal(a, n);
        printMatrix(a);
    }

    static void findPascal(int a[][],int n){
        for(int i=0;i<n;i++){
            a[i]= new int[i+1];
            a[i][0]=a[i][i]=1;
            for(int j=1;j<i;j++){
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
                
            }
        }
    }
    static void printMatrix(int a[][]){
        for(int []Elements:a){
            for(int Element:Elements){
                System.out.print(Element+" ");
            }
            System.out.println();
        }
    }
}
