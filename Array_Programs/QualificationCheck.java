/*
 * Problem Statement: 
 * There is a competition in a school.A qualifying score of 35 marks or more 
 * has been set as the cut-off to take part in this compitiion.
 * 
 * There are N subjects taught in a class. The marks obtained in each subject 
 * in semester 1 and 2 are given in the form of arrays S1 and S2 respectiverly.
 * The qulalifying score is calculated in the following way:
 * 
 *  Step 1 : Substract the marks obtained in the i th sub in sem 1 from the marks obtained
 *           in the i th sub in sem2.
 * 
 *  Step 2 : Add the marks of upto P subjects with the maximum scores obtained after the substraciton.
 *           This will give students qualifying marks. If marks >= 35 return "Qualified" else "Disqualifed".
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class QualificationCheck {
    public static int sum=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No of Subjects (N): ");
        int N = scanner.nextInt();
        System.out.print("Enter the subjects Consideration value (P): ");
        int P = scanner.nextInt();
        int[] S1 = new int[N];
        int[] S2 = new int[N];

        System.out.println("Enter subject marks of Semester 1:");
        for (int i = 0; i < N; i++) {
            S1[i] = scanner.nextInt();
        }
        System.out.println("Enter subjects marks of Semester 2:");
        for (int i = 0; i < N; i++) {
            S2[i] = scanner.nextInt();
        }
        String result = isQualifiedOrNot(N, P, S1, S2);
        System.out.println(result+" "+sum);

        scanner.close();
    }

    public static String isQualifiedOrNot(int N, int P, int[] S1, int[] S2) {
        Integer DiffArray[]=new Integer[N];
        for(int i=0;i<N;i++){
            DiffArray[i]=S2[i]-S1[i];
        }

        Arrays.sort(DiffArray,Collections.reverseOrder());
        for(int i = 0; i < P; i++) {
            sum += DiffArray[i];
        }

        return sum>=35?"Qualified":"Disqualified";
        
    }
}


/*

Output: 

    Enter No of Subjects (N): 5
    Enter the subjects Consideration value (P): 3
    Enter subject marks of Semester 1:
    5 10 15 20 25
    Enter subjects marks of Semester 2:
    15 30 20 30 25
    Qualified 40

 */