package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog901a {
    public static void printFile(Scanner input) {
        String output = "";
        while (input.hasNext()) {
            output += input.next() + " ";
        }
        System.out.println(output);
        reverseString(output);
    }
    public static void reverseString(String s) {
        String reversed = "";
        for (int lcv = s.length()-1; lcv > 0; lcv--) {
            reversed += s.substring(lcv-1,lcv);
        }
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog512h.dat"));
            printFile(input);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Good morning life and all Things glad and beautiful My pockets nothing hold But he that owns the gold The sun is my great friend His spending has no end Hail to the morning sky Which bright clouds measure high Hail to you birds whose throats Would number leaves by notes Hail to you shady bowers And you green fields of flowers Hail to you women fair That make a show so rare In cloth as white as milk Be it calico or silk Good morning life and all Things glad and beautiful
lufituaeb dna dalg sgnihT lla dna efil gninrom dooG klis ro ocilac ti eB klim sa etihw sa htolc nI erar os wohs a ekam tahT riaf nemow uoy ot liaH srewolf fo sdleif neerg uoy dnA srewob ydahs uoy ot liaH seton yb sevael rebmun dluoW staorht esohw sdrib uoy ot liaH hgih erusaem sduolc thgirb hcihW yks gninrom eht ot liaH dne on sah gnidneps siH dneirf taerg ym si nus ehT dlog eht snwo taht eh tuB dloh gnihton stekcop yM lufituaeb dna dalg sgnihT lla dna efil gninrom dooG
 */