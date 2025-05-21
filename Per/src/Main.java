import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter First or Last Name: ");
        String input = scan.nextLine();
        List<Person> people = new ArrayList<>();
        people.add(new Person("MelKing","King",24));
        people.add(new Person("Alice", "Johnson", 30));
        people.add(new Person("Bob", "Smith", 28));
        people.add(new Person("Carol", "Williams", 35));
        people.add(new Person("David", "Brown", 22));
        people.add(new Person("Eve", "Davis", 27));
        people.add(new Person("Frank", "Miller", 31));
        people.add(new Person("Grace", "Wilson", 26));
        people.add(new Person("Hank", "Moore", 29));
        people.add(new Person("Ivy", "Taylor", 33));


        List<Person> matches = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(input) || person.getLastName().equalsIgnoreCase(input))
                .toList();
        if (matches.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            System.out.println("Matches found: ");
            matches.forEach(System.out::println);

            double averageAge = matches.stream()
                    .mapToInt(Person::getAge)
                    .average()
                    .orElse(0.0);
            System.out.println("Average age: " + averageAge);
        }

        Person oldest = Collections.max(people, Comparator.comparingInt(Person::getAge));
                            System.out.println("Oldest age: " + oldest);
                            Person youngest = Collections.min(people, Comparator.comparingInt(Person::getAge));
                        System.out.println("Youngest age: " + youngest);
                        }
                    }
















