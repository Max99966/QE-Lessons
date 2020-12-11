package ProjectTUMO.Test;

import ProjectTUMO.Model.Staff;
import ProjectTUMO.Service.StaffService;

import java.util.Scanner;

public class TestTUMO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isMenu = true;
        while (isMenu){
            System.out.println("________________Menu________________");
            System.out.println("1. Register a Student.txt");
            System.out.println("2. Get the list of all students");
            System.out.println("3. Sort students by year of birth");
            System.out.println("4. Create a Staff account");
            System.out.println("5. Get the list of all active staff members' accounts");
            System.out.println("6. Sort staff by their salaries");
            System.out.println("7. Exit menu");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Registering a student");
                    break;
                case 2:
                    System.out.println("Getting the list of all students");
                    break;
                case 3:
                    System.out.println("Getting the list of alasfda");
                    break;
                case 4:
                    System.out.println("Creating a staff account");
                    StaffService.registerStaffAndWriteToFile();
                    break;
                case 7:
                    System.out.println("Exiting menu.");
                    isMenu = false;
                    break;
                default:
                    System.out.println("Wrong command");
                    break;
            }
        }

    }
}
