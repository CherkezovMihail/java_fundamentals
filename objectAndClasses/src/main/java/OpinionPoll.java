import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> allPersons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] persons = scanner.nextLine().split(" ");

            Person currentPerson = new Person(persons[0], Integer.parseInt(persons[1]));

            allPersons.add(currentPerson);
        }

        for (Person person : allPersons) {
            if (person.getAge() > 30) {
                System.out.printf("%s - %d%n", person.getName(), person.getAge());
            }
        }
    }
}
