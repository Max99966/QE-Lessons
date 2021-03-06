package Lesson5.model;

public class student {
    private String name;
    private int year;
    private char gender;
    private boolean isPhd;

    public student() {
    }

    public student(String name, int year, char gender, boolean isPhd) {
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.isPhd = isPhd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isPhd() {
        return isPhd;
    }

    public void setPhd(boolean phd) {
        isPhd = phd;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Gender: " + (gender == 'm' ? "male" : "female"));
        System.out.println("isPHD: " + (isPhd ? "Yes" : "No"));
    }
}
