package ProjectTUMO.Student;

import ProjectTUMO.GenderException;
import ProjectTUMO.Human;

import java.sql.Time;
import java.util.Date;
import java.util.Locale;

public class Student extends Human {
    private char gender = 'f';
    private String birthDay = "01-12-2008";
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

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getTumoGmail() {
        return tumoGmail;
    }

    public void setTumoGmail(String tumoGmail) {
        this.tumoGmail = getUserName() + "@tumo.org";
    }
}
