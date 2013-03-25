package studentmarks;

import java.util.Scanner;


public class StudentMarks {
    public static void main(String[] args) {
        // EXAMPLE

        // [0][1][2][3][4]
        //  4  6  2  2  3
        //  3  5  2  4  6
        //  6  4  2  5  2

        // 3 marks with value 2 in discipline number 2

        int[][] marks = new int[20][30];


        // Enter m and n

        System.out.print("enter m: ");
        int m = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("enter n: ");
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        if (m > 20 || n > 30) {
            System.out.println("Incorrect input data!");
        }

        // Fill marks
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("enter " + (i + 1) + " student's " + (j + 1) + " mark:");
                int markValue = Integer.parseInt(new Scanner(System.in).nextLine());
                while (markValue < 2 || markValue > 6) {
                    System.out.println("enter mark between 2 and 6:");
                    markValue = Integer.parseInt(new Scanner(System.in).nextLine());
                    marks[i][j] = markValue;
                }
                marks[i][j] = markValue;
            }
        }

        int[] marksWithValue2 = new int[n];

        // Find all values of 2
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (marks[i][j] == 2) {
                    marksWithValue2[j]++;
                }
            }
        }

        int max = marksWithValue2[0];
        int index = 0;

        // index is number of discipline
        for (int i = 0; i < n; i++) {
            if (marksWithValue2[i] > max) {
                max = marksWithValue2[i];
                index = i;
            }
        }

        System.out.println("Result: " + max + " marks with value 2 in discipline with number " + index);
    }
}
