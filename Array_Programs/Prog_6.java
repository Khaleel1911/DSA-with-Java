// 9) Java Program to print the largest and smallest element in an array

public class Prog_6 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,1,5,6,7,8,9,89};
        int  max=a[0];
        int min=a[0];
        for(int element:a){
            if(element>max){
                max=element;
            }
            if(element<min){
                min=element;
            }
        }

        System.out.println("Largest Element is: "+max);
        System.out.println("Smallest Element is: "+min);
    }
}


/*output
 * Largest Element is: 89
    Smallest Element is: 1 
 */