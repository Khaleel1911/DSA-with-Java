
import java.util.Scanner;

public class SpiralTraverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Enter matrix diemensions---");
        System.out.println("Enter No of rows:");
        int r = sc.nextInt();
        System.out.println("Enter No of columns:");
        int c = sc.nextInt();
        int a[][] = new int[r][c];

        System.out.println("Enter Matrix  Elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix is:");
        printMatrix(a);
        System.out.println("Spiral Traversal is: ");
        spiralTraverse(a, r, c);
    }

    static void spiralTraverse(int a[][], int r, int c) {
        int topRow = 0, rightColumn = c - 1, bottomRow = r - 1, leftColumn = 0;

        int totalelements = 0;
        while (totalelements < r * c) {
            for (int j = leftColumn; j <= rightColumn && totalelements < r * c; j++) {
                System.out.print(a[topRow][j] + " ");
                totalelements++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && totalelements < r * c; i++) {
                System.out.print(a[i][rightColumn] + " ");
                totalelements++;
            }
            rightColumn--;
            for (int j = rightColumn; j >= leftColumn && totalelements < r * c; j--) {
                System.out.print(a[bottomRow][j] + " ");
                totalelements++;
            }
            bottomRow--;
            for (int i = bottomRow; i >= topRow && totalelements < r * c; i--) {
                System.out.print(a[i][leftColumn] + " ");
                totalelements++;
            }
            leftColumn++;
        }
    }

    static void printMatrix(int a[][]) {
        for (int[] Elements : a) {
            for (int Element : Elements) {
                System.out.print(Element + " ");
            }
            System.out.println(" ");
        }
    }
}
