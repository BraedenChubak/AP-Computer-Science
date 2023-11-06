package Q2.Prog213fArray;

public class Cl213f {
    private double myKwh;
    private double myCost;

    public Cl213f(double kwh) {
        myKwh = kwh;
        myCost = 0;
    }

    public void calc() {
        if (myKwh <= 2000) { myCost = myKwh * 0.07; }
        else if (myKwh <= 10000) { myCost = (2000 * 0.07) + ((myKwh - 2000) * 0.05); }
        else { myCost = (2000 * 0.07) + (8000 * 0.05) + ((myKwh - 10000) * 0.04); }
    }

    public String toString() {
        return String.format("The Cost of %.0f KWH is $%.2f", myKwh, myCost);
    }
}
