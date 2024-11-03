import java.security.spec.ECPublicKeySpec;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("---Enter matrix diemensions---");
        System.out.println("Enter No of rows:");
        int r=sc.nextInt();
        System.out.println("Enter No of columns:");
        int c=sc.nextInt();
        int a[][]=new int[r][c];

        System.out.println("Enter Matrix  Elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix is:");
        printMatrix(a);
        System.out.println("Transposed Matrix is:");
       int[][]trans= transpose(r,c,a);
        printMatrix(trans);
        
    }

    static int[][] transpose(int r,int c,int a[][]){
        int b[][]=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                b[i][j]=a[j][i];
            }
        }
        return b;
    }
    static void printMatrix(int a[][]){
        for(int[] Elements:a){
            for(int Element:Elements){
                System.out.print(Element+" ");
            }
            System.out.println(" ");
        }
    }
}
