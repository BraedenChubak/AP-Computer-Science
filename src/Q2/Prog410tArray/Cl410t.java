package Q2.Prog410tArray;

public class Cl410t {
    private int myID;
    private int myIncome;
    private int myMembers;

    public Cl410t(int id, int income, int members) {
        myID = id;
        myIncome = income;
        myMembers = members;
    }

    public int getMyID() { return myID; }
    public int getMyIncome() { return myIncome; }
    public int getMyMembers() { return myMembers; }

    public String toString() {
        return String.format("%d\t%d\t%d", myID, myIncome, myMembers);
    }
}
