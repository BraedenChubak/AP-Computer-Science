package Q1.Prog76aCl;

import java.util.*;

public class Prog76aCl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a digit you really hate: ");
        int in = input.nextInt();

        Cl76a magic = new Cl76a(in);
        magic.calc();

        int step1 = magic.getStep1();
        int finalnum = magic.getFinalnum();

        System.out.println(in +"\nX 9\n\n____________\n" + step1 + "\nX 12345679\n\n____________\n" + finalnum + "\nSurprise!");
    }
}

/*
Enter a digit you really hate: 7
7
X 9

____________
63
X 12345679

____________
777777777
Surprise!
 */