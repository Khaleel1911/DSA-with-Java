// 4 Java Program to right rotate the elements of an array
// An integer n is provied. shift elements "n" times right .
public class Prog_4{
    public static void main(String[] args) {
        int []array={1,2,3,4,5};
        int n=1;
        for(int i=1;i<=n;i++){
            int last=array[array.length-1],j;
            for(j=array.length-1;j>0;j--){
                array[j]=array[j-1];
                    
            }
            array[j]=last;
        }
        print_Array(array);
    }

    static void print_Array(int a[]) {
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}