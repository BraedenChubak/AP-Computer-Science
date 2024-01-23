package Q3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog465h.dat"));
            int rows;
            int cols;
            while (input.hasNext()) {
                rows = input.nextInt();
                cols = input.nextInt();
                int[][] regmat = new int[rows][cols];
                int count = 0;
                int regnums = rows * cols;
                for (int r = 0; r < regmat.length; r++) {
                    for (int c = 0; c < regmat[r].length; c++) {
                        regmat[r][c] = input.nextInt();
                        if (regmat[r][c] != 0) { count++; }
                    }
                }
                int[][] redmat = new int[count][3];
                int rednums = count * 3;
                count = 0;
                for (int r = 0; r < rows; r++) {
                    for (int c = 0; c < cols; c++) {
                        if (regmat[r][c] != 0) {
                            redmat[count][0] = r+1;
                            redmat[count][1] = c+1;
                            redmat[count][2] = regmat[r][c];
                            count++;
                        }
                    }
                }
                System.out.println("Original matrix");
                for (int r = 0; r < rows; r++) {
                    for (int c = 0; c < cols; c++) {
                        System.out.print(regmat[r][c] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("Reduced matrix");
                for (int r = 0; r < redmat.length; r++) {
                    for (int c = 0; c < redmat[r].length; c++) {
                        System.out.print(redmat[r][c] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
                if (regnums < rednums) { System.out.println("The Original Matrix is Abundant\n"); }
                if (regnums > rednums) { System.out.println("The Original Matrix is Sparse\n"); }
                if (regnums == rednums) { System.out.println("The Original Matrix and The Sparse Matrix are Equally Efficient\n"); }
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Original matrix
0 0 7 0 0 0
0 0 0 0 -8 0
0 0 0 0 0 0
2 0 0 0 0 0
0 0 0 0 0 0

Reduced matrix
1 3 7
2 5 -8
4 1 2

The Original Matrix is Sparse

Original matrix
0 2 0 3 0 1
8 0 4 0 1 0
0 3 0 1 0 -7
5 0 9 0 6 0
0 2 0 -1 0 7

Reduced matrix
1 2 2
1 4 3
1 6 1
2 1 8
2 3 4
2 5 1
3 2 3
3 4 1
3 6 -7
4 1 5
4 3 9
4 5 6
5 2 2
5 4 -1
5 6 7

The Original Matrix is Abundant

Original matrix
0 0 1 0 0 2
3 0 0 4 0 0
0 0 5 0 0 6
7 0 0 8 0 0
0 0 9 0 0 1

Reduced matrix
1 3 1
1 6 2
2 1 3
2 4 4
3 3 5
3 6 6
4 1 7
4 4 8
5 3 9
5 6 1

The Original Matrix and The Sparse Matrix are Equally Efficient
 */