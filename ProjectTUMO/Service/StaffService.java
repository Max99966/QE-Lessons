package ProjectTUMO.Service;

import ProjectTUMO.Exceptions.LocationException;
import ProjectTUMO.Exceptions.NameException;
import ProjectTUMO.Exceptions.RoleException;
import ProjectTUMO.Exceptions.SalaryException;
import ProjectTUMO.Model.Staff;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StaffService {

    private static Staff[] staffMembers;

    public static Staff registerStaff() {
        Scanner scanner = new Scanner(System.in);
        Staff staff = new Staff();
        boolean check = true;
        while (check) {
            System.out.println("Please enter the name for the new staff member.");
            String firstName = scanner.nextLine();
            try {
                staff.setFirstName(firstName);
                check = false;
            } catch (NameException e) {
                System.out.println("Please try again");
                e.printStackTrace();
            }
        }
        check = true;
        while (check) {
            System.out.println("Please enter the last name for the new staff member.");
            String lastName = scanner.nextLine();
            try {
                staff.setLastName(lastName);
                check = false;
            } catch (NameException e) {
                System.out.println("Please try again");
                e.printStackTrace();
            }
        }
        check = true;
        while (check) {
            System.out.println("Please enter the role for the staff member. (coach/manager/developer/content creator)");
            String role = scanner.nextLine();
            try {
                staff.setRole(role);
                check = false;
            } catch (RoleException e) {
                System.out.println("Please try again");
                e.printStackTrace();
            }
        }
        check = true;
        while (check) {
            System.out.println("Please enter the salary for the newly created staff member.");
            double salary = scanner.nextInt();
            try {
                staff.setSalary(salary);
                check = false;
            } catch (SalaryException e) {
                System.out.println("Please try again");
                e.printStackTrace();
            }
        }
        return staff;
    }

    public static void registerStaffAndWriteToFile() {
        Staff staff = new Staff();
        String data = "\n" + staff;
        try {
            FileService.write("src/ProjectTUMO/Staff.txt", data);
            System.out.println("Staff member's information has been successfully written to Staff.txt file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void createStaffArrayFromFile() throws Exception {
        String[] staffData = FileService.read("src/ProjectTUMO/Staff.txt");
        Staff[] staffMembers = new Staff[staffData.length - 1];
        for (int i = 0; i < staffMembers.length; i++) {
            staffMembers[i] = new Staff(staffData[i + 1]);
        }
        StaffService.staffMembers = staffMembers;
    }

    public static void printStaffFromFile(Staff staff) throws Exception {
        createStaffArrayFromFile();
        if (isEmpty()){
            System.out.println("File is empty");
        }else {
            for (int i = 0; i < staffMembers.length; i++) {
                System.out.print((i+1) + ". ");
                printStaff(staffMembers[i]);
            }
        }
    }

    public static void printStaff (Staff staff){
        System.out.println("Staff member's first name: " + staff.getFirstName());
        System.out.println("Staff member's last name: " + staff.getLastName());
        System.out.println("Staff member's username: " + staff.getUserName());
        System.out.println("Staff member's role: " + staff.getRole());
        System.out.println("Staff member's salary: " + staff.getRole());
        System.out.println("Staff member's location: " + staff.getLocation());
    }

    public static void setLocation(Staff staff) {
        System.out.println("Please enter the location for the newly created staff member from this list: Armenia, Albania, Russia, Lebanon, Germany, France");
        Scanner sc = new Scanner(System.in);
        String l = sc.next();
        switch (l) {
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
    private static boolean isEmpty() {
        return staffMembers.length == 0;
    }

    public static Staff[] getStaffMembers() {
        return staffMembers;
    }
}
