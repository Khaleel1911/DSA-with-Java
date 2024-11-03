import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("---Enter matrix diemensions---");
        System.out.println("Enter Matrix 1 rows:");
        int r1=sc.nextInt();
        System.out.println("Enter Matrix 1 columns:");
        int c1=sc.nextInt();
        System.out.println("Enter Matrix 2 rows:");
        int r2=sc.nextInt();
        System.out.println("Enter Matrix 2 columns:");
        int c2=sc.nextInt();
        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        int mul[][]=new int[r1][c2];
        if(c1!=r2){
            System.out.println("Matrix multiplication is not possible!!!");
            return;
        }

        System.out.println("Enter Matrix 1 Elements:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Matrix 2 Elements:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("Product Matrix is:");
        multiply(r1,c1,r2,c2,a,b,mul);
        
    }

    static void multiply(int r1,int c1,int r2,int c2,int a[][],int b[][],int mul[][]){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                int sum=0;
                for(int k=0;k<c1;k++){
                    sum+=a[i][k]*b[k][j];
                }
                mul[i][j]=sum;
            }
        }

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
