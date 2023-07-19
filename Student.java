package lab4;

public class Student extends Person {
    private String major;
    private double GPA;

    public Student(String name, String birthdate, String major, double GPA) {
        super(name, birthdate);
        this.major = major;
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String convertGPAToLetter() {
        if (GPA >= 3.7) {
            return "A";
        } else if (GPA >= 3.3) {
            return "A-";
        } else if (GPA >= 3.0) {
            return "B+";
        } else if (GPA >= 2.7) {
            return "B";
        } else if (GPA >= 2.3) {
            return "B-";
        } else if (GPA >= 2.0) {
            return "C+";
        } else if (GPA >= 1.7) {
            return "C";
        } else if (GPA >= 1.3) {
            return "C-";
        } else if (GPA >= 1.0) {
            return "D+";
        } else if (GPA >= 0.7) {
            return "D";
        } else {
            return "F";
        }
    }

    @Override
    public String toString() {
        return super.toString() + ": " + major + ", " + GPA;
    }
}

