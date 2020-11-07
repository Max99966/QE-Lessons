package Lesson4;

public class Student {
    private String firstName;
    private String lastName;
    private char gender;
    private int year;
    private double mark;
    private boolean isArmenian;

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        if (y >= 1905 && y <= 2020) {
            year = y;
        }
    }

    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }
}
