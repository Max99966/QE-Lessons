package Lesson5.main;

import Lesson5.model.student;
import Lesson5.service.StudentService;

public class main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        student student1 = service.create();
        student student2 = service.create();
        student student3 = service.create();
        student[] students = {student1, student2, student3};

        System.out.println("-----------------");
        student1.printInfo();
        System.out.println("-----------------");
        service.biggerName(student1, student2);
        System.out.println("-----------------");
        service.printPhdStudents(students);
        System.out.println("-----------------");
        service.printMaleFrom2000(students);
        System.out.println("-----------------");
        service.biggestStudent(students).printInfo();
        System.out.println("-----------------");
    }
}
