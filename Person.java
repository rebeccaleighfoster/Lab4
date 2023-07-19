package lab4;

import java.time.LocalDate;

public class Person {
    private String name;
    private String birthdate;

    public Person(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public int calculateAge() {
        String[] parts = birthdate.split("-");
        int birthYear = Integer.parseInt(parts[0]);
        int currentYear = LocalDate.now().getYear();
        return currentYear - birthYear;
    }

    @Override
    public String toString() {
        return name + " (" + birthdate + ")";
    }
}
