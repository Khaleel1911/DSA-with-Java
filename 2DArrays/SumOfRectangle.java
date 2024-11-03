/*
 * Problem Statement:
 * Given a matrix 'a' of dimension n x m and 2 coordinates (l1, r1)
 * and (l2,r2). Return the sum of the rectangle from (l1,r1) to (l2,r2).
 */

import java.util.Scanner;
public class SumOfRectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Rows and columns:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter "+ r*c +" Elements:");
        int a[][]=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter l1,r1,l2,r2:");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        
        findPrefixSum(a);  //for method 2 it is required
        findPrefixSumCol(a);  //for method 3 both are required.
        int sum=findRectangleSum(a,l1,r1,l2,r2);
        // printMatrix(a);
        
        System.out.println("Rectangle Sum is: "+sum);
    }

    /*
     
    Brute force Method

     static int findRectangleSum(int a[][],int l1,int r1,int l2,int r2){
        
     // we can add 'if condition' to check the valid co-ordinates of the matrix.
     int sum=0;
     for(int i=l1;i<=l2;i++){
        for(int j=r1;j<=r2;j++){
            sum+=a[i][j];
        }
    }
    return sum;
    }

    */

    //method 2 using row prefix sum matrix

    
    static int findRectangleSum(int a[][],int l1,int r1,int l2,int r2){
        // for(int i=l1;i<=l2;i++){
            //     sum+=a[i][r2-r1];  code for method 2
            // }


            // code for method 3
            int ans,sum=0,up=0,left=0,leftup=0;
            sum=a[l2][r2];
            if(r1>=1){
                left=a[l2][r1-1];
            }
            if(l1>=1){
                up=a[l1-1][r2];
            }

            if(l1>=1 && r1>=1){
                leftup=a[l1-1][r1-1];
            }
            
            ans = sum -up -left +leftup;
            return ans;
        }
        
        static void findPrefixSum(int a[][]){
            for(int i=0;i<a.length;i++){
                for(int j=1;j<a[i].length;j++){
                    a[i][j]+=a[i][j-1];
                }
            }
        }
        
    //method 3 using row and column prefix sum matrix.
        
    static void findPrefixSumCol(int a[][]){
        for(int i=1;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]+=a[i-1][j];
            }
        }
    }
    static void printMatrix(int a[][]){
        for(int[] Elements:a){
            for(int Element:Elements){
                System.out.print(Element+" ");
            }
            System.out.println();
        }
    }
}