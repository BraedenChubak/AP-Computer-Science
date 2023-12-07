package Q2.Prog214c;

public class Cl214c {
    private String grade;
    private double gallons;
    private double preWashCost;
    private boolean wash;
    private double washCost;
    private double totalCost;

    public Cl214c(String g, double gl, String w) {
        grade = g;
        gallons = gl;
        if (w.equals("Y")) { wash = true; }
        else { wash = false; }
        preWashCost = 0;
        washCost = 0;
        totalCost = 0;
    }

    public void calc() {
        if (grade.equals("R")) {
            preWashCost = gallons * 1.359;
        }
        else if (grade.equals("P")) {
            preWashCost = gallons * 1.479;
        }
        else if (grade.equals("H")) {
            preWashCost = gallons * 1.429;
        }
        if (wash) {
            if (gallons > 10 && gallons < 20) {
                washCost = 02 * ((20 - Math.floor(gallons)) / 10);
            }
            if (gallons < 10) {
                washCost = 2;
            }
        }
        totalCost = preWashCost + washCost;
    }

    public String toString() {
        return String.format("%.1f %s gallons:\t$%.2f\nCar Wash? %b:\t$%.2f\nTotal:\t$%.2f\n",gallons,grade,preWashCost,wash,washCost,totalCost);
    }
}
