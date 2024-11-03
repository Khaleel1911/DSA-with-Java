
import java.util.Scanner;

/*
 * Problem Statement:
 * Given a positve integer n, generate an n x n matrix filled with elements from
 * 1 to n^2 in spiral order
 */
public class FillMatrixSpiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        fillSpiralMatrix(a,n,n);


    }

    static void fillSpiralMatrix(int a[][],int r,int c){
        int topRow = 0, rightColumn = c - 1, bottomRow = r - 1, leftColumn = 0;
        int count=1;
        int totalelements = 0;
        while (totalelements < r * c) {
            for (int j = leftColumn; j <= rightColumn && totalelements < r * c; j++) {
                a[topRow][j]= count++;
                totalelements++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && totalelements < r * c; i++) {
                a[i][rightColumn]= count++;
                totalelements++;
            }
            rightColumn--;
            for (int j = rightColumn; j >= leftColumn && totalelements < r * c; j--) {
                a[bottomRow][j]=count++;
                totalelements++;
            }
            bottomRow--;
            for (int i = bottomRow; i >= topRow && totalelements < r * c; i--) {
                a[i][leftColumn] = count++;
                totalelements++;
            }
            leftColumn++;
        }

        printMatrix(a);
    }
    static void printMatrix(int a[][]) {
        for (int[] Elements : a) {
            for (int Element : Elements) {
                System.out.print(Element + "   ");
            }
            System.out.println(" ");
        }
    }
}
