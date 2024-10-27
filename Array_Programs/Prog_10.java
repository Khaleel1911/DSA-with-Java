// Java Program to Print Odd and Even Numbers from an array

public class Prog_10 {
    public static void main(String[] args) {
        int []arr={2,15,4,8,96,35,13,19};

        // printing even nums
        System.out.println("Even numbers in array are: ");
        for(int element:arr){
            if(element%2==0){
                System.out.print(element+" ");
            }
        }
        System.out.println(" ");
        // printing odd nums
        System.out.println("Odd numbers in array are: ");
        for(int element:arr){
            if(element%2!=0){
                System.out.print(element+" ");
            }
        }
    }
}


/*

output: 

Even numbers in array are: 
2 4 8 96  
Odd numbers in array are: 
15 35 13 19 
 */