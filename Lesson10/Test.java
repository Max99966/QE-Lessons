package Lesson10;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.setAge(-57);
        } catch (AgeException e) {
            System.out.println("Wrong value");
        }

        try {
            student.setName("Maksim");
        } catch (NameException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

}
