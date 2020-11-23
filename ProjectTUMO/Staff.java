package ProjectTUMO;

public class Staff extends Human {
    private String role;

    public Staff(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
