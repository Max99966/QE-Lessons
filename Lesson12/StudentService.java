package Lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class StudentService {
    static List<Student> convert (List<String> data){
        List<Student> students = new ArrayList<>();
        for (String x: data){
            students.add(new Student(x));
        }
        return students;
    }

    static Student maxByMark (List<Student> students){
        return Collections.max(students);
    }

    static String sortByName (List<Student> students){
        Collections.sort(students, new NameComparator());
        StringJoiner jr = new StringJoiner(" ");
        for (Student s: students){
            jr.add(s.toString());
        }
        return jr.toString();
    }

}
