package Exam;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService service = new PlaneService();
        Plane plane1 = service.create();
        Plane plane2 = service.create();
        Plane plane3 = service.create();
        Plane [] planes = {plane1, plane2, plane3};

        System.out.println("Task 1");
        service.printTask1(plane1);
        System.out.println("***********");
        System.out.println();

        System.out.println("Task 2");
        service.printTask2(plane1);
        System.out.println("***********");
        System.out.println();

        System.out.println("Task 3");
        service.printTask3(plane1, plane2);
        System.out.println("***********");
        System.out.println();

        System.out.println("Task 4");
        System.out.println(service.printTask4(plane1, plane2));
        System.out.println("***********");
        System.out.println();

        System.out.println("Task 5");
        service.printTask5(plane1, plane2, plane3);
        System.out.println("***********");
        System.out.println();

        System.out.println("Task 6");
        service.printTask6(planes);
        System.out.println("***********");
        System.out.println();

        System.out.println("Task 7");
        service.printTask7(planes);
        System.out.println("***********");
        System.out.println();

        System.out.println("Task 8");
        service.printTask8(planes);
        System.out.println("***********");
        System.out.println();

        System.out.println("Task 9");
        service.printTask9(planes);
        System.out.println("***********");
        System.out.println();

        System.out.println("Task 10");
        service.printTask10(planes);


    }
}
