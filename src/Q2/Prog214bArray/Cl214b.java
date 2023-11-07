package Q2.Prog214bArray;

public class Cl214b {
    private int empNum;
    private double YTDPay;
    private double baseRate;
    private double shiftCode;
    private double hoursWorked;
    private double grossPay;
    private double taxRate;
    private double withholding;
    private double FICA;

    public Cl214b(int num, double pay, double rate, double code, double hours) {
        empNum = num;
        YTDPay = pay;
        baseRate = rate;
        shiftCode = code;
        hoursWorked = hours;
        grossPay = 0;
        taxRate = 0;
        withholding = 0;
        FICA = 0;
    }

    public void calc() {
        grossPay = baseRate * hoursWorked;

        if (grossPay < 100) { taxRate = 0; }
        if (grossPay < 150) { taxRate = 0.08; }
        if (grossPay < 200) { taxRate = 0.12; }
        if (grossPay < 300) { taxRate = 0.15; }
        else { taxRate = 0.175; }

        withholding = grossPay * taxRate;
        if (YTDPay > 17300) { FICA = 0; }

    }
}
