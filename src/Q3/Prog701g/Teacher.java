package Q3.Prog701g;

public class Teacher extends Person{
    public int myNumStus;

    public Teacher(String fn, String ln, int stu) {
        super(fn, ln);
        myNumStus = stu;
    }

    public int getStudents() { return myNumStus; }
}
