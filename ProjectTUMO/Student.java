package ProjectTUMO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Human {
    private char gender;
    private String birthday;
    private String phoneNumber;
    private int studentId;

    Scanner scanner = new Scanner(System.in);
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Student(String firstName, String lastName, String middleName, char gender, String birthday, String phoneNumber, int studentId) throws ParseException {
        super(firstName, lastName, middleName);
        setGender(gender);
        setBirthday(birthday);
        setPhoneNumber(phoneNumber);
        setStudentId(studentId);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) throws ParseException {
        Date parse = sdf.parse(birthday);
        birthday = parse.toString();
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
