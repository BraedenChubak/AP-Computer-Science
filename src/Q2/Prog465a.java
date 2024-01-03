package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("langdat/465a.dat"));
            int[][] mat1 = new int[4][4];
            int[][] mat2 = new int[4][4];
            int[][] matFinal = new int[4][4];
            for (int r = 0; r < 8; r++) {
                for (int c = 0; c < 4; c++) {
                    if (r < 4) { mat1[r][c] = input.nextInt(); }
                    else { mat2[r-4][c] = input.nextInt(); }
                }
            }
            for (int r = 0; r < mat1.length; r++) {
                for (int c = 0; c < mat1[0].length; c++) {
                    if (mat1[r][c] > mat2[r][c]) { matFinal[r][c] = mat1[r][c]; }
                    else { matFinal[r][c] = mat2[r][c]; }
                }
            }

            System.out.println("Matrix 1");
            

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
