package Q1.Prog213bCl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213bCl {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog213b.txt"));
            int qnt = 0;

            while (input.hasNext()) {
                qnt = input.nextInt();
                Cl213b wowsa = new Cl213b(qnt);
                wowsa.calc();
                System.out.println(wowsa);
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
