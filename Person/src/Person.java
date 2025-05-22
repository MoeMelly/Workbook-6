import static java.io.File.separator;


public class Person implements Comparable<Person> {
    String firstName;
    String lastName;
    int age;


    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {

        if (this.lastName == null && o.lastName == null) {
            return 0;
        } else if (this.lastName == null) {
            return 1;

        } else if (o.lastName == null) {
            return -1;

        } else {
            return this.lastName.compareTo(o.lastName);
        }


    }
    @Override
    public String toString() {
        return separator + System.lineSeparator() +
                firstName + System.lineSeparator() +
                lastName + System.lineSeparator() +
                age + System.lineSeparator() +
                separator;
    }

}




