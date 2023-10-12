package Q1.Prog82aCl;

public class Cl82a {
    private int speedLimit;
    private int carSpeed;
    private int fine;

    public Cl82a(int limit, int speed) {
        speedLimit = limit;
        carSpeed = speed;
        fine = 0;
    }

    public void calc() {
        fine = 20 + (carSpeed - speedLimit) * 5;
    }

    public int getFine() { return fine; }
}
