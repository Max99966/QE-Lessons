package ProjectTUMO;

public class Human {

    private String firstName = "Name";
    private String lastName = "Last Name";
    private String middleName = null;
    private String username;

    public Human(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Human(String firstName, String lastName, String middleName) {
        setFirstName(firstName);
        setLastName(lastName);
        setMiddleName(middleName);
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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

    public String getUsername() {
        username = getFirstName() + "." + getLastName();
        return username.toLowerCase();
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
