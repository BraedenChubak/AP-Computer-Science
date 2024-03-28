package Q4;

import java.util.Scanner;

public class MSOE_2019_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter letter 1: ");
        String ch1 = input.next();
        System.out.print("Enter letter 2: ");
        String ch2 = input.next();
        System.out.print("Enter text line: ");
        String temp = input.next();
        String line = temp + input.nextLine();
        String combo1 = ch1 + ch2;
        String combo2 = ch2 + ch1;
        int count = 0;
        for (int lcv = 0; lcv < line.length()-1; lcv++) {
            if (line.substring(lcv,lcv+2).equals(combo1)) {
                count++;
            }
            else if (line.substring(lcv,lcv+2).equals(combo2)) {
                count++;
            }
        }
        System.out.println("The count for this line of text is: " + count);
    }
}
/*
Enter letter 1: e
Enter letter 2: i
Enter text line: their fields are in the hidden foreign forest
The count for this line of text is: 3
 */