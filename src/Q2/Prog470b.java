package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("langdat/prog464a.dat"));
            int[][] mat = new int[5][5];

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = input.nextInt();
                }
            }

            int mainSum = 0;
            int otherSum = 0;
            for (int lcv = 0; lcv < 5; lcv++) {
                mainSum += mat[lcv][lcv];
                otherSum += mat[4-lcv][lcv];
            }

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }

            System.out.println("Main Diagonal Sum: " + mainSum);
            System.out.println("Other Diagonal Sum: " + otherSum);

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
Main Diagonal Sum: 147
Other Diagonal Sum: -3
 */