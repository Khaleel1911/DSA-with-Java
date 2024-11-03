import java.util.Scanner;
public class AdditionOfMatrix {
    public static void main(String[] args) {
        System.out.println("Enter Martrix dimension: ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int r=sc.nextInt();
        System.out.println("Enter no of columns:");
        int c=sc.nextInt();

        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int d[][]=new int[r][c];

        System.out.println("Enter matrix 1 Elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter matrix 2 Elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sum of Matrixes is:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                d[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(d[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
