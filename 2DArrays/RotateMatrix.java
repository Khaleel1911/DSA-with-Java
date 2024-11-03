import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        System.out.println("Enter Order of Square Matrix:");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[][]=new int[r][r];

        System.out.println("Enter matrix  Elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix is:");
        printMatrix(a);
        System.out.println("Rotated Matrix is:");
        int rotate[][]=rotateMatrix(a,r);
        printMatrix(rotate);

    }

    /*
     * If we want to rotate In-place then,
     * 1. Transpose the matrix first
     * 2. Reverse Each row to obtain the rotated matrix;
        {1,2,3},        
        {4,5,6}, 
        {7,8,9}
            
        Transpose:
        {1,4,7},
        {2,5,8},
        {3,6,9}

        reverse the rows
        {7,4,1},
        {8,5,2},
        {9,6,3}
     */

    static int[][] rotateMatrix(int [][]a,int r){
        int [][]rotate=new int[r][r];
        int k=r-1;
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                rotate[j][k]=a[i][j];
            }
            k--;
        }
        return rotate;
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
