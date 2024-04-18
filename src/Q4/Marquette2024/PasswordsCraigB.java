import java.util.*;

// This is for the "On the Topic of Passwords" problem for team Craig B

public class PasswordsCraigB {
    public static int strongPasswordChecker(String s) {
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        int num3Chain = 0; 
        if (s.length() >= 3) {
            for (int i = 0; i < s.length() - 2; i++) {
                if (s.substring(i, i+1).equals(s.substring(i+1, i+2)) && s.substring(i, i+1).equals(s.substring(i+2, i+3))) {
                    num3Chain++; 
                    i+=2; 
                }
            }
        }
        for (int lcv = 0; lcv < s.length(); lcv++) {
            String curChar = s.substring(lcv,lcv+1);
            for (int lcv2 = 0; lcv2 <= 9; lcv2++) {
                String curLCV = "";
                curLCV += lcv2;
                if (curChar.equals(curLCV)) {
                    hasDigit = true;
                    lcv++;
                    break;
                }
            }
            if (!(curChar.toUpperCase().equals(curChar)) && curChar.toLowerCase().equals(curChar)) {
                if (curChar.toUpperCase().equals(curChar)) { hasUpper = true; }
                if (curChar.toLowerCase().equals(curChar)) { hasLower = true; }
            }
        }
        if (!hasLower) { num3Chain--; }
        if (!hasUpper) { num3Chain--; }

        int minChanges = num3Chain;
        if (!hasLower) { minChanges++; }
        if (!hasUpper) { minChanges++; }
        if (!hasDigit) { minChanges++; }
        if (s.length() < 6) {
            if (minChanges + s.length() > 6) {
                return minChanges;
            } else {
                return 6 - s.length();
            }
        } else if (s.length() > 20) {
            if (s.length() - minChanges < 20) {
                return minChanges;
            } else {
                return s.length() - 20;
            }
        }
        return minChanges;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        int result = strongPasswordChecker(password);
        System.out.println(result);
        scanner.close();
    }
}