package Q4;

import java.util.Scanner;

public class MSOE_2021_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the letter: ");
        String letter = input.next();
        System.out.print("Enter sentence: ");
        String temp = input.next();
        String sentence = temp + input.nextLine();
        String[] words = sentence.split(" ");
        boolean found = false;
        for (String word : words) {
            if (word.substring(word.length()-1,word.length()).equals(letter)) {
                System.out.println(word);
                found = true;
                break;
            }
        }
        if (!found) { System.out.println("not found"); }
    }
}
/*
Enter the letter: g
Enter sentence: coffee is a way of stealing time that should by rights belong to your older self
stealing
 */