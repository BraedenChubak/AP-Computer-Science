package Q3.Prog702q;

public class Truck extends Vehicle {
    private int miles;

    public Truck(String n, int t, double v, int m) {
        super(n, t, v);
        miles = m;
    }

    public int getMiles() { return miles; }
    public double getValue() { return (value - 0.25 * miles); }
}
