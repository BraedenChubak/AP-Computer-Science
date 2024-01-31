package Q3;

import java.util.Scanner;

public class Prog492h {
    public static void main(String[] args) {
        String[][] life = new String[30][30];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting state for the Game of Life (30x30):");
        int rowCount = 0;
        while (rowCount < 30) {
            String temp = input.nextLine();
            String[] tempString = new String[30];
            while (temp.length() < 30) {
                temp += " ";
            }
            for (int lcv = 0; lcv < temp.length(); lcv++) {
                tempString[lcv] = temp.substring(lcv,lcv+1);
            }
            life[rowCount] = tempString;
            rowCount++;
        }

        int genCount = 0;
        while (genCount < 16) { // start of generation loop

            System.out.println("Generation " + genCount + ":");
            for (int r = 0; r < 30; r++) { // prints every cell
                for (int c = 0; c < 30; c++) {
                    System.out.print(life[r][c]);
                }
                System.out.println();
            }

            for (int r = 0; r < 30; r++) { // loop to check for births and deaths
                for (int c = 0; c < 30; c++) {
                    // start of finding neighbors
                    int neighbors = 0;
                    if (c == 0) { // left wall
                        if (r == 0) { // top left corner
                            for (int r2 = r; r2 < r+2; r2++) {
                                for (int c2 = c; c2 < c+2; c2++) {
                                    if (life[r2][c2].equals("*") || life[r2][c2].equals("D")) {
                                        neighbors++;
                                    }
                                }
                            }
                        }
                        else if (r == 29) { // bottom left corner
                            for (int r2 = r; r2 > r-2; r2--) {
                                for (int c2 = c; c2 < c+2; c2++) {
                                    if (life[r2][c2].equals("*") || life[r2][c2].equals("D")) {
                                        neighbors++;
                                    }
                                }
                            }
                        } else { // non-corner left wall
                            for (int r2 = r-1; r2 < r+2; r2++) {
                                for (int c2 = c; c2 < c+2; c2++) {
                                    if (life[r2][c2].equals("*") || life[r2][c2].equals("D")) {
                                        neighbors++;
                                    }
                                }
                            }
                        }
                    }
                    else if (c == 29) { // right wall
                        if (r == 0) { // top right corner
                            for (int r2 = r; r2 < r+2; r2++) {
                                for (int c2 = c; c2 > c - 2; c2--) {
                                    if (life[r2][c2].equals("*") || life[r2][c2].equals("D")) {
                                        neighbors++;
                                    }
                                }
                            }
                            
                        }
                        else if (r == 29) { // bottom right corner
                            for (int r2 = r; r2 > r-2; r2--) {
                                for (int c2 = c; c2 > c-2; c2--) {
                                    if (life[r2][c2].equals("*") || life[r2][c2].equals("D")) {
                                        neighbors++;
                                    }
                                }
                            }
                        } else { // non-corner right wall
                            for (int r2 = r-1; r2 < r+2; r2++) {
                                for (int c2 = c; c2 > c-2; c2--) {
                                    if (life[r2][c2].equals("*") || life[r2][c2].equals("D")) {
                                        neighbors++;
                                    }
                                }
                            }
                        }
                    }
                    else if (r == 0) { // non-corner top wall
                        for (int r2 = r; r2 < r+2; r2++) {
                            for (int c2 = c - 1; c2 < c + 2; c2++) {
                                if (life[r2][c2].equals("*") || life[r2][c2].equals("D")) {
                                    neighbors++;
                                }
                            }
                        }
                    }
                    else if (r == 29) { // non-corner bottom wall
                        for (int r2 = r; r2 > r-2; r2--) {
                            for (int c2 = c-1; c2 < c+2; c2++) {
                                if (life[r2][c2].equals("*") || life[r2][c2].equals("D")) {
                                    neighbors++;
                                }
                            }
                        }
                    }
                    else if (c!=0 && c!=29 && r!=0 && r!=29) { // middle cell
                        for (int r2 = r-1; r2 < r+2; r2++) {
                            for (int c2 = c-1; c2 < c+2; c2++) {
                                if (life[r2][c2].equals("*") || life[r2][c2].equals("D")) {
                                    neighbors++;
                                }
                            }
                        }
                    }
                    // end of finding neighbors here
                    if (life[r][c].equals("*")) { // if there is a cell
                        neighbors--; // finding neighbors counted its own cell, this fixes wrong calculations
                        if (neighbors < 2) {
                            life[r][c] = "D"; // D for dying cells that must still be counted
                        }
                        if (neighbors > 3) {
                            life[r][c] = "D";
                        }
                    }
                    if (life[r][c].equals(" ")) { // if there's no cell
                        if (neighbors == 3) {
                            life[r][c] = "B"; // B for cells being born that cannot be counted yet
                        }
                    }
                }
            }

            for (int r = 0; r < 30; r++) { // loop to replace "D" and "B" with actual cells
                for (int c = 0; c < 30; c++) {
                    if (life[r][c].equals("D")) {
                        life[r][c] = " ";
                    }
                    else if (life[r][c].equals("B")) {
                        life[r][c] = "*";
                    }
                }
            }
            genCount++;
        }
    }
}
