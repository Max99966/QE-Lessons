package ProjectTUMO;

import ProjectTUMO.Staff.Staff;
import ProjectTUMO.Staff.StaffService;

public class TestTUMO {
    public static void main(String[] args) {
        Staff staff1 = StaffService.registerStaff();
        StaffService.setLocation(staff1);
        Staff staff2 = StaffService.registerStaff();
        StaffService.setLocation(staff2);
        System.out.println("------------------");
        System.out.println();
        StaffService.printStaff(staff1);
        System.out.println("------------------");
        System.out.println();
        StaffService.printStaff(staff2);

    }
}
