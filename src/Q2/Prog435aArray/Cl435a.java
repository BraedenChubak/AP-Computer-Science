package Q2.Prog435aArray;

public class Cl435a {
    String myCar;
    int myType;
    int myGate;
    double myBase;
    double myFactor;
    double myTotal;

    public Cl435a(int type, int gate) {
        myType = type;
        myGate = gate;
        myBase = 0;
        myFactor = 0;
        myTotal = 0;
    }

    public void calc() {
        if (myType == 1) { myCar = "Compact Car"; myFactor = 1; }
        if (myType == 2) { myCar = "Small Car";  myFactor = 1.3; }
        if (myType == 3) { myCar = "Mid Size Car";  myFactor = 1.6; }
        if (myType == 4) { myCar = "Full Size Car";  myFactor = 2; }
        if (myType == 5) { myCar = "Truck";  myFactor = 2.4; }
        if (myType == 6) { myCar = "16 Wheeler";  myFactor = 2.7; }

        if (myGate == 1) { myBase = 1.35; }
        if (myGate == 2) { myBase = 2; }
        if (myGate == 3) { myBase = 2.5; }
        if (myGate == 4) { myBase = 3.25; }
        if (myGate == 5) { myBase = 4.1; }
        if (myGate == 6) { myBase = 4.8; }
        if (myGate == 7) { myBase = 5.5; }
        if (myGate == 8) { myBase = 6; }

        myTotal = myBase * myFactor;
    }

    public String toString() {
        return myCar + String.format("  \t\t%.2f\t%.2f\t$ %.2f", myBase, myFactor, myTotal);
    }
}
