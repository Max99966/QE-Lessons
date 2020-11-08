package Lesson4.LogicalStructures;

public class Registration {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int yearOfBirth = 2002;
    private int monthOfBirth = 01;
    private int dayOfBirth = 01;
    private String password;
    private String password2;

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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 1905 && yearOfBirth <= 2020) {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        if (monthOfBirth <= 12 && monthOfBirth >= 1) {
            this.monthOfBirth = monthOfBirth;
        }
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        if (dayOfBirth <= 31 && dayOfBirth >= 1) {
            this.dayOfBirth = dayOfBirth;
        }
    }

    public String getEmailAddress() {
        emailAddress = this.firstName + "." + this.lastName + this.yearOfBirth + "@gmail.com";
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        String l = " ";
        for (int i = 0; i < password.length(); i++) {
            l += "* ";
        }
        return l;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        String l = " ";
        for (int i = 0; i < password2.length(); i++) {
            l += "* ";
        }
        return l;
    }

    public void setPassword2(String password2) {
        if (password2.equals(password)) {
            this.password2 = password2;
        } else {
            System.out.println("Passwords do not match");
        }
    }
}
