package Q1.Prog88aCl;

public class Cl88a {
    private int mynum1;
    private int mynum2;
    private int mysum;
    private int mydiff;
    private int myprod;
    private double myavg;
    private int myabs;
    private int mymax;
    private int mymin;

    public Cl88a(int num1, int num2) {
        mynum1 = num1;
        mynum2 = num2;
        mysum = 0;
        mydiff = 0;
        myprod = 0;
        myavg = 0.0;
        myabs = 0;
        mymax = 0;
        mymin = 0;
    }

    public void calc() {
        mysum = mynum1 + mynum2;
        mydiff = mynum1 - mynum2;
        myprod = mynum1 * mynum2;
        myavg = mysum / 2.0;
        myabs = Math.abs(mydiff);
        if (mynum1 > mynum2) {
            mymax = mynum1;
            mymin = mynum2;
        } else {
            mymax = mynum2;
            mymin = mynum1;
        }
    }

    public int getMysum() { return mysum; }
    public int getMydiff() { return mydiff; }
    public int getMyprod() { return myprod; }
    public double getMyAvg() { return myavg; }
    public int getMyabs() { return myabs; }
    public int getMymax() { return mymax; }
    public int getMymin() { return mymin; }
}
