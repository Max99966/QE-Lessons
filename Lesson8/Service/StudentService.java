package Lesson8.Service;

import Lesson8.Model.Student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentService {
    //Print student.
    public static void printStudent(Student student) {
        System.out.println("First name: " + student.getFirstName());
        System.out.println("Last name: " + student.getLastName());
        System.out.println("Year: " + student.getYear());
        System.out.println("Gender: " + student.getGender());
        System.out.println("Mark: " + student.getMark());
    }

    //Task 1: Print full names of students
    public static void printTask1(Student[] students) {
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }

    //Task 2: Print all male students
    public static void printTask2(Student[] students) {
        for (Student student : students) {
            if (student.getGender() == 'm') {
                printStudent(student);
                System.out.println();
            }
        }
    }

    //Task 3: Print all female students who has mark greater then 50.4
    public static void printTask3(Student[] students) {
        for (Student student : students) {
            if (student.getGender() == 'f' && student.getMark() > 50.4) {
                printStudent(student);
                System.out.println();
            }
        }
    }

    //Task 4: Print student information having the minimal mark
    public static void printTask4(Student[] students) {
        Student min = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getMark() < min.getMark()) {
                min = students[i];
            }
        }
        printStudent(min);
    }

    //Task 5: Print biggest male student information
    public static void printTask5(Student[] students) {
        Student max = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getYear() < max.getYear() && students[i].getGender() == 'm') {
                max = students[i];
            }
        }
        if (max.getGender() == 'm') {
            printStudent(max);
        } else {
            System.out.println("There are no boys.");
        }
    }

    //Task 6: Print students sorted by mark
    public static void printTask6(Student[] students){
        for (int i = 0; i < students.length-1; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].getMark() > students[j + 1].getMark()) {
                    Student s = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = s;
                }
            }
        }
        for (Student student : students) {
            printStudent(student);
            System.out.println();
        }
    }
    //Task 7: Print female students sorted by year
    public static void printTask7(Student[] students){
        for (int i = 0; i < students.length-1; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].getYear() > students[j + 1].getYear()) {
                    Student s = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = s;
                }
            }
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender() == 'f'){
                printStudent(students[i]);
                System.out.println();
            }
        }
    }

}
