package Q1;

public class Prog122d {
    public static void main(String[] args) {
        int num = -13;
        int output = 0;
        while (num < 16) {
            num ++;
            output = (int)(Math.pow(num, 6) - 3 * Math.pow(num, 5) - 93 * Math.pow(num, 4) + 87 * Math.pow(num, 3) + 1596 * Math.pow(num, 2) - (1380 * num) - 2800);
            System.out.println(num + "\t" + output);
        }
    }
}

/*
-12	1897280
-11	982800
-10	453600
-9	173888
-8	45360
-7	0
-6	-6400
-5	0
-4	6048
-3	7280
-2	4320
-1	0
0	-2800
1	-2592
2	0
3	2240
4	0
5	-10800
6	-32032
7	-60480
8	-84240
9	-78400
10	0
11	217728
12	671840
13	1496880
14	2872800
15	5033600
16	8276688
 */
