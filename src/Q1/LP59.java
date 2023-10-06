package Q1;

import java.util.*;

public class LP59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        int cnum = 0;
        int square = 0;
        int cube = 0;
        int fourth = 0;
        int fifth = 0;
        System.out.println("x^1\tx^2\tx^3\tx^4\tx^5\t");
        for (int lcv = 0; lcv < num; lcv++) {
            cnum++;
            square = (int)Math.pow(cnum, 2);
            cube = (int)Math.pow(cnum, 3);
            fourth = (int)Math.pow(cnum, 4);
            fifth = (int)Math.pow(cnum, 5);
            System.out.println(cnum+"\t"+square+"\t"+cube+"\t"+fourth+"\t"+fifth);
        }
    }
}

/*
Enter a positive integer: 13
x^1	x^2	x^3	x^4	x^5
1	1	1	1	1
2	4	8	16	32
3	9	27	81	243
4	16	64	256	1024
5	25	125	625	3125
6	36	216	1296	7776
7	49	343	2401	16807
8	64	512	4096	32768
9	81	729	6561	59049
10	100	1000	10000	100000
11	121	1331	14641	161051
12	144	1728	20736	248832
13	169	2197	28561	371293
 */