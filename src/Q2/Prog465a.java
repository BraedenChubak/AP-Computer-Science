package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465a {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("langdat/prog465a.dat"));
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
            for (int r = 0; r < mat1.length; r++) {
                for (int c = 0; c < mat1[r].length; c++) {
                    System.out.print(mat1[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println();

            System.out.println("Matrix 2");
            for (int r = 0; r < mat2.length; r++) {
                for (int c = 0; c < mat2[r].length; c++) {
                    System.out.print(mat2[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println();

            System.out.println("Final Matrix");
            for (int r = 0; r < matFinal.length; r++) {
                for (int c = 0; c < matFinal[r].length; c++) {
                    System.out.print(matFinal[r][c] + " ");
                }
                System.out.println();
            }
            

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}

/*
Matrix 1
2 7 6 4
6 1 2 4
9 7 2 6
8 3 2 1

Matrix 2
4 1 3 7
6 2 3 8
7 2 2 4
4 2 3 1

Final Matrix
4 7 6 7
6 2 3 8
9 7 2 6
8 3 3 1
 */