package lab4;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Hermione Granger", "1979-09-19", "Computer Science", 3.9);
        System.out.println("Original Student: " + student);

        student.setName("Luna Lovegood");
        student.setBirthdate("1981-02-13");
        student.setMajor("Astronomy");
        student.setGPA(3.5);
        System.out.println("Updated Student: " + student);

        int age = student.calculateAge();
        System.out.println("Age: " + age);

        String letterGrade = student.convertGPAToLetter();
        System.out.println("Letter Grade: " + letterGrade);
    }
}

