package Q1.Prog213fCl;

public class Cl213f {
    int kwh;
    double cost;

    public Cl213f(int kw) {
        kwh = kw;
        cost = 0.0;
    }

    public void calc() {
        if (kwh <= 2000) { cost = kwh * 0.07; }
        else if (kwh <= 10000) { cost = (2000 * 0.07) + ((kwh - 2000) * 0.05); }
        else { cost = (2000 * 0.07) + (8000 * 0.05) + ((kwh - 10000) * 0.04); }
    }

    public double getCost() { return cost; }
}
