package Q3;

import java.util.Scanner;

public class Prog607a {
    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encode(int d, int m, int y) {
        String encode = "";
        encode += alphabet.substring(m-1,m);

        if (d < 10) { encode += "O"; }
        else if (d < 20) { encode += "Q"; }
        else if (d < 30) { encode += "R"; }
        else { encode += "S"; }

        int onesDay = d % 10;
        if (onesDay == 0) { encode += "O"; }
        else { encode += alphabet.substring(15+onesDay,16+onesDay); }

        int tensYear = y - 1970;
        encode += alphabet.substring(26-tensYear,27-tensYear);
        return encode;
    }

    public static String decode(String code) {
        String date = "";
        for (int lcv = 0; lcv < 12; lcv++) {
            if (code.substring(0,1).equals(alphabet.substring(lcv,lcv+1))) {
                date += lcv+1;
            }
        }
        date += "/";
        if (code.substring(1,2).equals("O")) {
            date += "0";
        } else {
            for (int lcv = 0; lcv < 4; lcv++) {
                if (code.substring(1,2).equals(alphabet.substring(lcv+16,lcv+17))) {
                    date += lcv+1;
                }
            }
        }
        if (code.substring(2,3).equals("O")) {
            date += "0";
        } else {
            for (int lcv = 0; lcv < 10; lcv++) {
                if (code.substring(2,3).equals(alphabet.substring(lcv+16,lcv+17))) {
                    date += lcv+1;
                }
            }
        }
        date += "/";
        for (int lcv = 0; lcv < 26; lcv++) {
            if (code.substring(3,4).equals(alphabet.substring(25-lcv,26-lcv))) {
                int year = 1971 + lcv;
                date += year;
            }
        }
        return date;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Encode or Decode? (E / D): ");
        String choice = input.nextLine();
        String code = "";
        if (choice.equals("E")) {
            System.out.print("Enter Day: ");
            int day = input.nextInt();
            System.out.print("Enter Month: ");
            int month = input.nextInt();
            System.out.print("Enter Year (4 digits): ");
            int year = input.nextInt();
            String encoded = encode(day, month, year);
            System.out.println("The code for this date is: " + encoded);
        } else if (choice.equals("D")) {
            System.out.print("Enter Code: ");
            code = input.nextLine();
            String decoded = decode(code);
            System.out.println("The date for your code is: " + decoded);
        } else {
            System.out.println("Not a valid choice!");
        }
    }
}
/*
Encode or Decode? (E / D): E
Enter Day: 14
Enter Month: 9
Enter Year (4 digits): 1983
The code for this date is: IQTN
 */

/*
Encode or Decode? (E / D): D
Enter Code: FOTX
The date for your code is: 6/04/1973
 */