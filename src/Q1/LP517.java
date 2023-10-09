package Q1;

import java.util.*;

public class LP517 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "Daniel Szelogowski";
        int trycount = 1;
        String guess = "";
        while (trycount <= 3) {
            System.out.print("What is the password? ");
            guess = input.nextLine();
            if (guess.equals(password)) {
                System.out.println("Password Correct!");
                break;
            }
            trycount++;
        }
    }
}
