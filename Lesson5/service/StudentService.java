package Lesson5.service;

import Lesson5.model.student;

import java.util.Scanner;

public class StudentService {
    public student create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println("Enter gender 'f' (female) or 'm' (male)");
        char gender = scanner.next().charAt(0);
        System.out.println("Enter is PHD 'y/n'");
        boolean isPhd = scanner.next().charAt(0) == 'y';

        return new student(name, year, gender, isPhd);
    }

    public void biggerName(student s1, student s2) {
        if (s1.getYear() < s2.getYear()) {
            System.out.println(s1.getName());
        } else {
            if (s1.getYear() > s2.getYear()) {
                System.out.println(s2.getName());
            } else {
                System.out.println(s1.getName() + ", " + s2.getName());
            }
        }
    }

    public void printPhdStudents(student[] students) {
        for (student s : students) {
            if (s.isPhd()) {
                System.out.println("***********");
                s.printInfo();
            }
        }
    }

    public void printMaleFrom2000(student[] students) {
        for (student s : students) {
            if (s.getYear() >= 2000 && s.getGender() == 'm') {
                System.out.println("***********");
                s.printInfo();
            }
        }
    }

    public student biggestStudent(student[] students) {
        student max = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getYear() < max.getYear()) {
                max = students[i];
            }
        }
        return max;
    }

    public void printSmallestGirl(student[] students) {
        student min = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getYear() > min.getYear() && students[i].getGender() == 'f') {
                min = students[i];
            }
        }
        if (min.getGender() == 'f') {
            min.printInfo();
        } else {
            System.out.println("No girls.");
        }
    }
}
