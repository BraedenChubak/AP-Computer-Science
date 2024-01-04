package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465b {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("langdat/prog465b.dat"));
            int[][] mat = new int[3][4];

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
            System.out.println("\nNumbers less than 100\nRow Column");
            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[r].length; c++) {
                    if (mat[r][c] < 100) {
                        int tempr = r+1;
                        int tempc = c+1;
                        System.out.println(tempr + "\t" + tempc);
                    }
                }
            }


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

Numbers less than 100
Row Column
2	1
2	4
3	2
 */