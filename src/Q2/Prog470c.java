package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog470c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog464a.dat"));

            int[][] mat = new int[6][6];  // 6 rows 6 col matrix

            for (int r = 0; r < mat.length-1; r++) {
                for (int c = 0; c < mat[r].length-1; c++) {
                    mat[r][c] = input.nextInt();
                }
            }
            System.out.println("Original Matrix");
            for (int r = 0; r < mat.length-1; r++) {
                for (int c = 0; c < mat[r].length-1; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println();

            for (int r = 0; r < mat.length-1; r++) {
                for (int c = 0; c < mat[r].length-1; c++) {
                    mat[r][5] += mat[r][c];  // Sum of row
                    mat[5][c] += mat[r][c];  // Sum of column
                    mat[5][5] += mat[r][c];  // Sum of table
                }
            }

            System.out.println("Matrix with totals");
            for (int[] row : mat) {
                for (int n : row) {
                    System.out.print(n + "\t");
                }
                System.out.println();
            }


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Original Matrix
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87

Matrix with totals
45	67	89	12	-3	210
-3	-6	-7	-4	-9	-29
96	81	-8	52	12	233
14	-7	72	29	-1	107
19	43	28	63	87	240
171	178	174	152	86	761
 */