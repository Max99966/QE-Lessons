package Lesson4.LogicalStructures;

import java.util.Scanner;
public class logicalStructure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Registration user = new Registration();
        String fn;
        String ln;
        String pw;
        String pw2;
        int y, d, m;

        System.out.println("Please enter your first name.");
        fn = input.nextLine();
        user.setFirstName(fn);
        System.out.println();

        System.out.println("Please enter your last name.");
        ln = input.nextLine();
        user.setLastName(ln);
        System.out.println();

        System.out.println("Please enter your year, month and day of birth");
        y = input.nextInt();
        m = input.nextInt();
        d = input.nextInt();
        user.setYearOfBirth(y);
        user.setMonthOfBirth(m);
        user.setDayOfBirth(d);
        System.out.println();

        System.out.println("Here is your newly created Email:");
        System.out.println(user.getEmailAddress());
        System.out.println();

        //It skips on this part, I don't know the reason for it thou
        System.out.println("Now, please create a new password");
        pw = input.nextLine();
        user.setPassword(pw);
        System.out.println();

        System.out.println("Please reenter your password");
        pw2 = input.nextLine();
        user.setPassword2(pw2);
        System.out.println();

        System.out.println("You are done!");
        System.out.println("Here are your inputted information:");
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Date of Birth: " + user.getDayOfBirth() + "/" + user.getMonthOfBirth() + "/" + user.getYearOfBirth());
        System.out.println("Email Address: " + user.getEmailAddress());
    }
}
