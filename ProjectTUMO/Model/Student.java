package ProjectTUMO.Model;

import ProjectTUMO.Exceptions.GenderException;

import java.time.LocalDate;

public class Student extends Human {
    private char gender = 'f';
    private LocalDate birthDay;
    private String tumoGmail;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender != '\u0000') {
            this.gender = gender;
        }else{
            throw new GenderException();
        }
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getTumoGmail() {
        return tumoGmail;
    }

    public void setTumoGmail(String tumoGmail) {
        this.tumoGmail = getUserName() + "@tumo.org";
    }
}
