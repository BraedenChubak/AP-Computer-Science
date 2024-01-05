package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("langdat/prog464a.dat"));
            int[][] mat = new int[6][5];

            for (int r = 0; r < mat.length-1; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = input.nextInt();
                }
            }

            for (int c = 0; c < mat[0].length; c++) {
                int sum = 0;
                for (int r = 0; r < mat.length-1; r++) {
                    sum += mat[r][c];
                }
                mat[5][c] = sum;
            }

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87
171 178 174 152 86
 */