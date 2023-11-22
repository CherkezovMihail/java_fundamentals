package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n =  Integer.parseInt(scanner.nextLine());

        List<Students.Student> allStudents = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputStudents = scanner.nextLine().split(" ");

            Students.Student currentStudent = new Students.Student(inputStudents[0], inputStudents[1], Double.parseDouble(inputStudents[2]));

            allStudents.add(currentStudent);

        }

        allStudents.sort(Comparator.comparingDouble(Students.Student::getGrade).reversed());

        for (Students.Student student : allStudents) {
            System.out.printf(student.toString());
        }
    }
}
