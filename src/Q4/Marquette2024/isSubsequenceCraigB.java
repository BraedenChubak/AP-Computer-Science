import java.util.*;

// This is for the "isSubsequence" problem for team Craig B

public class isSubsequenceCraigB {
    public static boolean isSubsequence(String s, String t) {
        int goodLoops = 0;
        for (int lcv = 0; lcv < s.length(); lcv++) {
            String nextChar = s.substring(lcv,lcv+1);
            for (int lcv2 = 0; lcv2 < t.length(); lcv2++) {
                if (nextChar.equals(t.substring(lcv2,lcv2+1))) {
                    goodLoops++;
                    if (lcv < s.length()-1) {
                        lcv++;
                        nextChar = s.substring(lcv,lcv+1);
                    }
                }
            }
        }
        if (goodLoops == s.length()) { return true; }
        else { return false; }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String SplusT = input.nextLine();
        String[] splitter = SplusT.split(" ");
        if (isSubsequence(splitter[0], splitter[1])) { System.out.println("True"); }
        else { System.out.println("False"); }
    }
}