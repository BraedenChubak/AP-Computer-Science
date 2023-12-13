package Q2.Prog215i;

public class Cl215i {
    private int ID;
    private double gallons;
    private double miles;
    private double mpg;

    public Cl215i(int vehicle, double g, double m) {
        ID = vehicle;
        gallons = g;
        miles = m;
        mpg = 0;
    }

    public void calc() {
        mpg = miles / gallons;
    }

    public int getID() { return ID; }
    public double getMPG() { return mpg; }

    public String toString() {
        return String.format("%d\t%.2f\t%.2f\t%.2f",ID,miles,gallons,mpg);
    }
}
