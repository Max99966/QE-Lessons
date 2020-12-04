package ProjectTUMO.Staff;

import ProjectTUMO.Human;
import ProjectTUMO.LocationException;

import java.util.Scanner;

public class StaffService {
    public static Staff registerStaff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String firstName = scanner.next();
        System.out.println("Please enter your last name.");
        String lastName = scanner.next();
        System.out.println("Please enter the role for the staff member. (coach/manager/developer)");
        String role = scanner.next();
        return new Staff(firstName, lastName, role);
    }

    public static void printStaff(Staff staff){
        System.out.println("First name: " + staff.getFirstName());
        System.out.println("Last name: " + staff.getLastName());
        System.out.println("Username: " + staff.getUserName());
        System.out.println("Role: " + staff.getRole());
        System.out.println("Location: " + staff.getLocation());
    }

    public static void setLocation(Staff staff){
        System.out.println("Please enter the location for the newly created staff member from this list: Armenia, Albania, Russia, Lebanon, Germany, France");
        Scanner sc = new Scanner(System.in);
        String l = sc.next();
        switch (l){
            case "Armenia":
                System.out.println("The location has been set to Armenia");
                staff.setLocation("Armenia");
                break;
            case "Albania":
                System.out.println("The location has been set to Albania");
                staff.setLocation("Albania");
                break;
            case "Russia":
                System.out.println("The location has been set to Russia");
                staff.setLocation("Russia");
                break;
            case "France":
                System.out.println("The location has been set to France");
                staff.setLocation("France");
                break;
            case "Lebanon":
                System.out.println("The location has been set to Lebanon");
                staff.setLocation("Lebanon");
                break;
            case "Germany":
                System.out.println("The location has been set to Germany");
                staff.setLocation("Germany");
                break;
            default:
                throw new LocationException();
        }

    }
}
