package Q2.LP39;

public class ClLP39 {
    int birthYear;
    int birthMonth;
    int birthDay;
    int todayYear;
    int todayMonth;
    int todayDay;
    int daysAlive;
    int hoursSlept;
    boolean monthOverflow;
    boolean dayOverflow;

    public ClLP39(int by, int bm, int bd, int ty, int tm, int td) {
        birthYear = by;
        birthMonth = bm;
        birthDay = bd;
        todayYear = ty;
        todayMonth = tm;
        todayDay = td;
        daysAlive = 0;
        hoursSlept = 0;
        monthOverflow = false;
        dayOverflow = false;
    }

    public void calc() {
        if (todayDay < birthDay) {
            dayOverflow = true;
        }
        if (todayMonth < birthMonth) {
            monthOverflow = true;
        }

        if (monthOverflow) {
            daysAlive = 365 * (todayYear - birthYear - 1);
        }
        else {
            daysAlive = 365 * (todayYear - birthYear);
        }
        if (dayOverflow) {
            daysAlive += 30 * (todayMonth - birthMonth - 1);
        }
        else {
            daysAlive += 30 * (todayMonth - birthMonth);
        }
        daysAlive += 30 - Math.abs(todayDay - birthDay);
        hoursSlept = 8 * daysAlive;
    }

    public int getDaysAlive() {
        return daysAlive;
    }
    public int getHoursSlept() {
        return hoursSlept;
    }
}
