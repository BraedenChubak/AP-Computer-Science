package Q1;

public class Prog122c {
    public static void main(String[] args) {
        int num = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        while (num < 10) {
            num += 2;
            num2 = num + 1;
            num3 = num * 2;
            num4 = (int)Math.pow(num, 2);
            System.out.println(num + "\t" + num2 + "\t" + num3 + "\t" + num4 + "\t");
        }
    }
}

/*
2	3	4	4
4	5	8	16
6	7	12	36
8	9	16	64
10	11	20	100
 */