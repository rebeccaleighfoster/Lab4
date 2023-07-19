package lab4;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Harry Potter", "1980-07-31");
        System.out.println("Original Person: " + person);

        person.setName("Ron Weasley");
        person.setBirthdate("1980-03-01");
        System.out.println("Updated Person: " + person);

        int age = person.calculateAge();
        System.out.println("Age: " + age);
    }
}

