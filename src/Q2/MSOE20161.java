package Q2;

import java.util.*;

public class MSOE20161 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a lowercase word: ");
        String word = input.nextLine();
        String reverse = "";
        for (int lcv = 0; lcv < word.length(); lcv++) {
            reverse += word.substring(word.length()-(lcv+1),word.length()-(lcv));
        }
        if (word.equals(reverse)) { System.out.println("That word is a palindrome!"); }
        else { System.out.println("That word isn't a palindrome!"); }
    }
}
