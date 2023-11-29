package Q2.LP314;

import java.util.*;

public class LP314 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("New York Results:");
        System.out.print("Aubrey: ");
        int nyA = input.nextInt();
        System.out.print("Martinez: ");
        int nyM = input.nextInt();
        System.out.println("New Jersey Results:");
        System.out.print("Aubrey: ");
        int njA = input.nextInt();
        System.out.print("Martinez: ");
        int njM = input.nextInt();
        System.out.println("Connecticut Results:");
        System.out.print("Aubrey: ");
        int ctA = input.nextInt();
        System.out.print("Martinez: ");
        int ctM = input.nextInt();
        ClLP314 electionFraud = new ClLP314(nyA, nyM, njA, njM, ctA, ctM);
        electionFraud.calc();
        System.out.println(electionFraud);
    }
}

/*
New York Results:
Aubrey: 43432
Martinez: 54252
New Jersey Results:
Aubrey: 42542
Martinez: 29542
Connecticut Results:
Aubrey: 31345
Martinez: 32854
Candidate	Votes	Percentage
Aubrey		117319	50.14
Martinez	116648	49.86
 */