package Q3.Prog702q;

public class Bus extends Vehicle{
    private String city;

    public Bus(String n, int t, double v, String c) {
        super(n, t, v);
        city = c;
    }

    public String getCity() { return city; }
}
