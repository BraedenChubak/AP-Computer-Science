package Q2.Prog214bArray;

public class Cl214b {
    private int empNum;
    private double YTDPay;
    private double baseRate;
    private double shiftCode;
    private double hoursWorked;
    private double grossPay;
    private double withholding;
    private double FICA;
    private double netPay;

    public Cl214b(int num, double pay, double rate, double code, double hours) {
        empNum = num;
        YTDPay = pay;
        baseRate = rate;
        shiftCode = code;
        hoursWorked = hours;
        grossPay = 0;
        withholding = 0;
        FICA = 0;
        netPay = 0;
    }

    public void calc() {
        grossPay = baseRate * hoursWorked;

        if (grossPay < 100) { withholding = 0; }
        else if (grossPay < 150) { withholding = 0.08 * grossPay; }
        else if (grossPay < 200) { withholding = 0.12 * grossPay; }
        else if (grossPay < 300) { withholding = 0.15 * grossPay; }
        else { withholding = 0.175 * grossPay; }

        if (YTDPay > 17300) { FICA = 0; }
        else if (YTDPay + grossPay <= 17300) { FICA = grossPay * 0.0605; }
        else { FICA = (YTDPay + grossPay - 17300) * 0.0605;}

        netPay = grossPay - withholding - FICA;
    }

    public String toString() {
        return String.format("Employee Number %d\nHours %.2f Rate %.2f Shift Factor %.2f\n\tCurrent\t\t\t   YTD\nGross Pay  %.2f    %.2f\nWithholding  %.2f\nFICA  %.2f\nNet Pay   %.2f\n---------------------------", empNum, hoursWorked, baseRate, shiftCode, grossPay, YTDPay, withholding, FICA, netPay);
    }
}
