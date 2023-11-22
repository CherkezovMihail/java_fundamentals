package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class Student {
        String first_Name;
        String lastName;
        double grade;

        public Student(String first_Name, String lastName, double grade) {
            this.first_Name = first_Name;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f%n", this.first_Name, this.lastName, this.grade);
        }
    }
}