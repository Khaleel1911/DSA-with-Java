// Java Program to Find 3rd Largest and Second Largest Number in an array
import  java.util.Arrays;
public class Prog_9 {
    public static void main(String[] args) {
        int a[]={1,2,5,6,3,2};  
        int b[]={44,66,99,77,33,22,55}; 
        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println("Third largest Element is: "+a[a.length-3]);
        System.out.println("Second largest Element is: "+a[a.length-2]);
        System.out.println("");
        System.out.println("Third largest Element is: "+b[b.length-3]);
        System.out.println("Second largest Element is: "+b[b.length-2]);
    }
}


/*

output: 

Third largest Element is: 3
Second largest Element is: 5

Third largest Element is: 66
Second largest Element is: 77
 */