// 2. Java Program to find the frequency of each element in the array.

import java.util.*;

public class Prog_2 {

    public static void main(String[] args) {
        int[] array_1 = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
        Arrays.sort(array_1); // sored the array to make it organized
        Set<Integer> myset = new LinkedHashSet<Integer>();
        for (int element : array_1) {
            myset.add(element); // converted array to set to remove duplicates
        }
        for (int element : myset) {
            int count = 0;
            for (int i = 0; i < array_1.length; i++) {
                if (element == array_1[i]) {
                    count++;
                }
            }
            System.out.println(element + " Appeared:  " + count + " times");
        }
    }
}
