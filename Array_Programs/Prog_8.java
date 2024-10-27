// Java Program to sort the elements of an array in ascending and descending order
import java.util.Arrays;
public class Prog_8 {
    public static void main(String[] args) {
        int []arr={2,8,1,7,3};

        // Arrays.sort(arr); by using inbuilt sort() method. sorts array in asecending order.

        System.out.println("Sorted array in ascending order: ");
        arr=sort_ascending(arr); //sort using manual funtion which uses internally bubble sort.
        print_Array(arr);
        System.out.println("Sorted array in descending order: ");
        arr=sort_descending(arr); //sort using manual funtion which uses internally bubble sort.
        print_Array(arr);

    }

    static void print_Array(int a[]) {
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }

    static int[] sort_ascending(int a[]){
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        return a;
    }
    static int[] sort_descending(int a[]){
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        return a;
    }
}
