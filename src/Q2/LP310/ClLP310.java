package Q2.LP310;

import java.sql.SQLOutput;

public class ClLP310 {
    int burgers;
    int fries;
    int sodas;
    double tendered;
    double change;
    double subTotal;
    double tax;
    double total;

    public ClLP310(int b, int f, int s, double t) {
        burgers = b;
        fries = f;
        sodas = s;
        tendered = t;
        change = 0;
        subTotal = 0;
        tax = 0;
        total = 0;
    }

    public void calc() {
        subTotal = (burgers * 1.69) + (fries * 1.09) + (sodas * 0.99);
        tax = subTotal * 0.065;
        total = subTotal + tax;
        change = tendered - total;
    }

    public void returnstuff() {
        System.out.println("Total before tax: $" + Math.round(subTotal * 100) / 100.0);
        System.out.println("Tax: $" + Math.round(tax * 100) / 100.0);
        System.out.println("Final total: $" + Math.round(total * 100) / 100.0);
        System.out.println("Change: $" + Math.round(change * 100) / 100.0);
    }
}
