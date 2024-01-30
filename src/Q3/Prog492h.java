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
        while (genCount < 16) {
            System.out.println("Generation " + genCount + ":");
            for (int r = 0; r < 30; r++) {
                for (int c = 0; c < 30; c++) {
                    System.out.print(life[r][c]);
                }
                System.out.println();
            }
            for (int r = 0; r < 30; r++) {
                for (int c = 0; c < 30; c++) {

                }
            }

            genCount++;
        }
    }
}
