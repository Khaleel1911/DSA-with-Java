//  Java Program to print the sum of all the items of the array
public class Prog_7 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int sum=0;
        for(int element:arr){
            sum+=element;
        }
        System.out.println(sum);
    }
}

// output : 21