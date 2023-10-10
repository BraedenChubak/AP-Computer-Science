package Q1.Prog54bCl;

public class Cl54b {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int mySum;
    private double myAvg;

    public Cl54b (int numa, int numb, int numc, int numd){
        num1 = numa;
        num2 = numb;
        num3 = numc;
        num4 = numd;

    }

    public void calc() {
        mySum = num1 + num2 + num3 + num4;
        myAvg = mySum / 4.0;
    }

    public int getSum() { return mySum; }
    public double getAvg() { return myAvg; }
}
