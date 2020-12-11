package ProjectTUMO.Model;

import ProjectTUMO.Exceptions.RoleException;
import ProjectTUMO.Exceptions.SalaryException;

public class Staff extends Human {
    public static final double MINIMAL_SALARY = 90000;
    private static final String[] ROLES = {"Coach", "Manager", "Developer", "Content creater"};
    private String role;
    private double salary;

    public Staff() {
    }

    public Staff(String data) throws SalaryException {
        String[] splitData = data.split(",");
        setFirstName(splitData[0]);
        setLastName(splitData[1]);
        setUserName(splitData[2]);
        setRole(splitData[3]);
        setSalary(Double.parseDouble(splitData[4]));
    }

    public Staff(String firstName, String lastName, String role, double salary) {
        super(firstName, lastName);
        setUserName(firstName.toLowerCase() + "." + lastName.toLowerCase());
        this.role = role;
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        for (String s : ROLES) {
            if (s.equals(role)) {
                this.role = role;
            } else {
                throw new RoleException();
            }
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws SalaryException {
        if (salary >= MINIMAL_SALARY) {
            this.salary = salary;
        } else {
            throw new SalaryException("Minimal salary is: " + MINIMAL_SALARY);
        }
    }
}
