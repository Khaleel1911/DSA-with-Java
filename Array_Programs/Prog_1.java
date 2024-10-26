//  Java Program to copy all elements of one array into another array

public class Prog_1 {

    public static void main(String args[]) {
        int[] array_1 = {10, 20, 30, 40, 50,45,85};
        System.out.println("Original array is: ");
        print_Array(array_1);
        int[] copied_array = new int[array_1.length];
        System.out.println("Copied array is: ");

        // copied_array = array_1.clone();  -- by using inbuilt clone() method

        // copied_array=Arrays.copyOf(array_1, array_1.length);  -- by using copyof() method
        
        // copied_array=Arrays.copyOfRange(array_1, 0,array_1.length); -- by using copyOfRange() method

        //following code is by using basic brute force method

        for(int i=0;i<array_1.length;i++){
            copied_array[i]=array_1[i];
        }

        print_Array(copied_array);
    }

    static void print_Array(int a[]) {
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
