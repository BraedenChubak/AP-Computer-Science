package Q1.Prog76aCl;

public class Cl76a {
    private int num;
    private int step1;
    private int finalnum;

    public Cl76a(int input) {
        num = input;
        step1 = 0;
        finalnum = 0;
    }

    public void calc() {
        step1 = num * 9;
        finalnum = step1 * 12345679;
    }

    public int getStep1() { return step1; }
    public int getFinalnum() { return finalnum; }

}
