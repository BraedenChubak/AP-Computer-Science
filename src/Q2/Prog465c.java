package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465c {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("langdat/prog465c.txt"));
            int rows = input.nextInt();
            int cols = input.nextInt();
            int[][] mat = new int[rows][cols];

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    mat[r][c] = input.nextInt();
                }
            }

            System.out.println("Original Matrix");
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }

            int edgeSum = 0;
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    if (r == 0 || r == rows-1 || c == 0 || c == cols-1) {
                        edgeSum += mat[r][c];
                    }
                }
            }
            System.out.println("\nThe total of the edges is: " + edgeSum);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Original Matrix
100 195 182 225
83 125 235 67
129 42 100 750

The total of the edges is: 1873
 */