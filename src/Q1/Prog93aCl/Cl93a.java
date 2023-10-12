package Q1.Prog93aCl;

public class Cl93a {
    private int KWH;
    private double BaseR;
    private double SurC;
    private double CityT;
    private double due;
    private double latedue;

    public Cl93a(int ogKWH) {
        KWH = ogKWH;
        BaseR = 0;
        SurC = 0;
        CityT = 0;
        due = 0;
        latedue = 0;
    }

    public void calc() {
        BaseR = KWH * 0.0475;
        SurC = BaseR * 0.1;
        CityT = BaseR * 0.03;
        due = BaseR + CityT + SurC;
        latedue = due * 1.04;
    }
    public double getBaseR() {return BaseR;}
    public double getSurC() {return SurC;}
    public double getCityT() {return CityT;}
    public double getdue() {return due;}
    public double getlatedue() {return latedue;}

    public String toString() {
        return "KWH" + KWH + "\nBase Rate" + BaseR + "\nSurcharge" + SurC + "\nCityT" + CityT;
    }



}
