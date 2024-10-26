// 3 Java Program to left rotate the elements of an array
// An integer n is provied. shift elements "n" times left .
public class Prog_3{
    public static void main(String[] args) {
        int []array={1,2,3,4,5};
        int n=1;
        for(int i=1;i<=n;i++){
            int first=array[0],j;
            for(j=0;j<array.length-1;j++){
                array[j]=array[j+1];
                    
            }
            array[j]=first;
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