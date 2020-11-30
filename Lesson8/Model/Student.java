package Lesson8.Model;

import java.util.Arrays;


public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private char gender;
    private double mark;

    public Student(String s){
        String[] split = s.split(",");
        firstName = split[0];
        lastName = split[1];
        year = Integer.parseInt(split[2]);
        gender = split[3].charAt(0);
        mark = Double.parseDouble(split[4]);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}