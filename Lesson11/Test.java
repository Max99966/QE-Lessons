package Lesson11;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Maksim", 25);
        Student s2 = new Student("Maksim", 25);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(null));
    }
}

