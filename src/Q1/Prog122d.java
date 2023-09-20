package Q1;

public class Prog122d {
    public static void main(String[] args) {
        int num = -13;
        int output = 0;
        while (num < 16) {
            num ++;
            output = (int)(Math.pow(num, 6) - Math.pow((3 * num), 5) - Math.pow((93 * num), 4) + Math.pow((87 * num), 3) + Math.pow((1596 * num), 2) - (1380 * num) - 2800);
            System.out.println(num + "\t" + output);
        }
    }
}
