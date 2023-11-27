//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        String[] words = new String[999999]; // very large int
//        String[] output = new String[999999]; // same size
//        Scanner input = new Scanner(System.in);
//        String currentWord = input.nextLine();
//        int count = 0;
//        int count2 = 0;
//        while (!currentWord.equals("")) {
//            words[count] = currentWord;
//            currentWord = input.nextLine();
//            count++;
//        }
//        for (int lcv = 0; lcv < count; lcv++) {
//            words[lcv] = words[lcv].toUpperCase();
//            if (words[lcv].length() == 6) {
//                currentWord = words[lcv];
//                if (words[lcv] != null); {
//                    for (int lcv2 = 3; lcv2 < 6; lcv2++) {
//                        if (words[lcv].substring(lcv2,lcv2+1).equals("O")) {
//                            if (lcv2 == 5) { currentWord = currentWord.substring(0,lcv2) + "0"; }
//                            currentWord = currentWord.substring(0,lcv2) + "0" + currentWord.substring(lcv2+1);
//                        }
//                        if (words[lcv].substring(lcv2,lcv2+1).equals("I") || words[lcv].substring(lcv2,lcv2+1).equals("L")) {
//                            if (lcv2 == 5) { currentWord = currentWord.substring(0,lcv2) + "1"; }
//                            currentWord = currentWord.substring(0,lcv2) + "1" + currentWord.substring(lcv2+1);
//                        }
//                        if (words[lcv].substring(lcv2,lcv2+1).equals("Z")) {
//                            if (lcv2 == 5) { currentWord = currentWord.substring(0,lcv2) + "2"; }
//                            currentWord = currentWord.substring(0,lcv2) + "2" + currentWord.substring(lcv2+1);
//                        }
//                        if (words[lcv].substring(lcv2,lcv2+1).equals("E") || words[lcv].substring(lcv2,lcv2+1).equals("M") || words[lcv].substring(lcv2,lcv2+1).equals("W")) {
//                            if (lcv2 == 5) { currentWord = currentWord.substring(0,lcv2) + "3"; }
//                            currentWord = currentWord.substring(0,lcv2) + "3" + currentWord.substring(lcv2+1);
//                        }
//                        if (words[lcv].substring(lcv2,lcv2+1).equals("A")) {
//                            if (lcv2 == 5) { currentWord = currentWord.substring(0,lcv2) + "4"; }
//                            currentWord = currentWord.substring(0,lcv2) + "4" + currentWord.substring(lcv2+1);
//                        }
//                        if (words[lcv].substring(lcv2,lcv2+1).equals("S")) {
//                            if (lcv2 == 5) { currentWord = currentWord.substring(0,lcv2) + "5"; }
//                            currentWord = currentWord.substring(0,lcv2) + "5" + currentWord.substring(lcv2+1);
//                        }
//                        if (words[lcv].substring(lcv2,lcv2+1).equals("G")) {
//                            if (lcv2 == 5) { currentWord = currentWord.substring(0,lcv2) + "6"; }
//                            currentWord = currentWord.substring(0,lcv2) + "6" + currentWord.substring(lcv2+1);
//                        }
//                        if (words[lcv].substring(lcv2,lcv2+1).equals("T")) {
//                            if (lcv2 == 5) { currentWord = currentWord.substring(0,lcv2) + "7"; }
//                            currentWord = currentWord.substring(0,lcv2) + "7" + currentWord.substring(lcv2+1);
//                        }
//                        if (words[lcv].substring(lcv2,lcv2+1).equals("B") || words[lcv].substring(lcv2,lcv2+1).equals("X")) {
//                            if (lcv2 == 5) { currentWord = currentWord.substring(0,lcv2) + "8"; }
//                            currentWord = currentWord.substring(0,lcv2) + "8" + currentWord.substring(lcv2+1);
//                        }
//                        if (words[lcv].substring(lcv2,lcv2+1).equals("J") || words[lcv].substring(lcv2,lcv2+1).equals("P")) {
//                            if (lcv2 == 5) { currentWord = currentWord.substring(0,lcv2) + "9"; }
//                            currentWord = currentWord.substring(0,lcv2) + "9" + currentWord.substring(lcv2+1);
//                        }
//                    }
//                }
//            boolean is1337 = true;
//            for (int lcv3 = 3; lcv3 < currentWord.length(); lcv3++) {
//                is1337 = true;
//                if (Character.isLetter(currentWord.charAt(lcv3))) {
//                    is1337 = false;
//                    break;
//                }
//            }
//            if (is1337) {
//                output[count2] = currentWord;
//                count2++;
//            }
//            }
//        }
//        for (int lcv2 = 0; lcv2 < count2; lcv2++) {
//            System.out.println(output[lcv2]);
//        }
//    }
//}