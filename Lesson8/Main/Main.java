package Lesson8.Main;

import Lesson8.Service.FileService;
import Lesson8.Model.Student;
import Lesson8.Service.StudentService;

import java.io.IOException;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {
        String[] read = FileService.read("C:\\Users\\Administrator\\Desktop\\QE Classes\\Homeworks\\src\\Lesson8\\test.txt");
        System.out.println(Arrays.toString(read));
        Student student1 = new Student(read[0]);
        Student student2 = new Student(read[1]);
        Student student3 = new Student(read[2]);
        Student[] students = {student1, student2, student3};

        System.out.println("This is task 1");
        StudentService.printTask1(students);
        System.out.println("----------------");
        System.out.println();

        System.out.println("This is task 2");
        StudentService.printTask2(students);
        System.out.println("----------------");
        System.out.println();

        System.out.println("This is task 3");
        StudentService.printTask3(students);
        System.out.println("----------------");
        System.out.println();

        System.out.println("This is task 4");
        StudentService.printTask4(students);
        System.out.println("----------------");
        System.out.println();

        System.out.println("This is task 5");
        StudentService.printTask5(students);
        System.out.println("----------------");
        System.out.println();

        System.out.println("This is task 6");
        StudentService.printTask6(students);
        System.out.println("----------------");
        System.out.println();

        System.out.println("This is task 7");
        StudentService.printTask7(students);
        System.out.println("----------------");
        System.out.println();
    }


}
