public class Student extends Person {
    private int SID;

    public Student(String name, int SID) {
        super(name);
        this.SID = SID;
    }

    @Override public String printInfo() {
        return name + ", " + this.SID;
    }
}
