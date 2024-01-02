package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog464a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("langdat/prog464a.dat"));

            // 5 arrays (rows) of length 6
            int[][] mat = new int[5][6];
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length-1; col++) {  // mat[row].length-1
                    mat[row][col] = input.nextInt();
                    // Read in a 5x5 matrix
                }
            }

            // Find biggest number in each row
            // then set the last column to that number
            // for every row
            for (int r = 0; r < mat.length; r++) {
                int rowbig = Integer.MIN_VALUE;  // mat[r][0];
                for (int c = 0; c < mat[0].length-1; c++) {  // mat[row].length-1
                    if (mat[r][c] > rowbig) {
                        rowbig = mat[r][c];
                    }
                }
                mat[r][5] = rowbig;
            }

            // Print out the 2d array nicely
            for (int[] row : mat) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }

}

/*
45 67 89 12 -3 89
-3 -6 -7 -4 -9 -3
96 81 -8 52 12 96
14 -7 72 29 -1 72
19 43 28 63 87 87
 */