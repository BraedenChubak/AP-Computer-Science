package Q2.Prog402aArray;

public class Cl402a {
    private int myID;
    private int myScore;
    private double myAvg;
    private double myDiff;

    public Cl402a(int ID, int score, double avg) {
        myID = ID;
        myScore = score;
        myAvg = avg;
        myDiff = 0;
    }

    public void calc() {
        myDiff = myScore - myAvg;
    }

    public int getMyID() { return myID; }
    public int getMyScore() { return myScore; }

    public String toString() {
        return String.format("%d     %d     %.2f", myID, myScore, myDiff);
    }
}
