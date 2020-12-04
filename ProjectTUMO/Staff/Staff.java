package ProjectTUMO.Staff;

import ProjectTUMO.Human;

public class Staff extends Human {
    private String role;

    public Staff(String firstName, String lastName, String role) {
        setFirstName(firstName);
        setLastName(lastName);
        setUserName(firstName.toLowerCase() + "." + lastName.toLowerCase());
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
