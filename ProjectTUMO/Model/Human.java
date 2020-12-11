package ProjectTUMO.Model;

import ProjectTUMO.Exceptions.NameException;

public class Human {
    private String firstName = "First Name";
    private String lastName = "Last Name";
    private String userName;
    private final String [] locations = {"Armenia", "Russia", "France", "Albania", "Germany", "Lebanon"};
    private String location;

    public Human() {
    }

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.matches("[A-Z][a-z]*") && !firstName.isEmpty()) {
            this.firstName = firstName;
        } else {
            throw new NameException();
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        } else {
            throw new NameException();
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
