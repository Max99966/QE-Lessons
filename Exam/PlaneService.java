package Exam;

import Lesson5.model.student;

import java.util.Scanner;

public class PlaneService {
    public Plane create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the model of the plane");
        String model = scanner.next();
        System.out.println("Enter the country of the plane");
        String country = scanner.next();
        System.out.println("Enter the year of the plane");
        int year = scanner.nextInt();
        System.out.println("Enter the hours in the air of the plane");
        int hours = scanner.nextInt();
        System.out.println("Is the plane military or not? 'y' for yes 'n' for no");
        boolean military = scanner.next().charAt(0) == 'y';
        System.out.println("Enter the weight of the plane");
        int weight = scanner.nextInt();
        System.out.println("Enter the wingspan of the plane");
        int wingspan = scanner.nextInt();
        System.out.println("Enter the top speed of the plane");
        int topSpeed = scanner.nextInt();
        System.out.println("Enter the seats of the plane");
        int seats = scanner.nextInt();
        System.out.println("Enter the cost of the plane");
        int cost = scanner.nextInt();

        return new Plane(model, country, year, hours, military, weight, wingspan, topSpeed, seats, cost);
    }


//    Task 2. (score 5)
//    Create function:
//    Parameter one Plane
//    Result: print cost and topSpeed if the plane is military otherwise print model and country

    public void printTask2(Plane p1) {
        if (p1.isMilitary()) {
            System.out.println(p1.getCost() + "$");
            System.out.println(p1.getTopSpeed());
        } else {
            System.out.println(p1.getModel());
            System.out.println(p1.getCountry());
        }
    }

    //    Task 3. (score 7)
//    Create function:
//    Parameter two Planes
//    Result: return the plane which one is newer (if they have the same age return first one).
    public Plane printTask3(Plane p1, Plane p2) {
        if (p1.getYear() >= p2.getYear()) {
            return p1;
        } else {
            return p2;
        }
    }

//    Task 4. (score 7)
//    Create function:
//    Parameter two Planes
//    Result: return the model of the plane which has bigger wingspan (if they have the same - return second one).


    public String printTask4(Plane p1, Plane p2) {
        if (p1.getWingspan() > p2.getWingspan()) {
            return p1.getModel();
        } else {
            return p2.getModel();
        }
    }

//    Task 5. (score 7)
//    Create function:
//    Parameter three Planes
//    Result: print country of the plane with smallest seats count (if they have the same - print first).

    public void printTask5(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getSeats() < min.getSeats()) {
                min = planes[i];
            }
        }
    }

    //    Task 6. (score 7)
//    Create function:
//    Parameter array of Planes
//    Result: print all not military planes
    public void printTask6(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane.isMilitary()) {
                System.out.println(plane);
            }
        }
    }
//    Task 7. (score 10)
//    Create function:
//    Parameter array of Planes
//    Result: print all military planes which were in air more than 100 hours.

    public void printTask7(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane.getHours() > 100) {
                System.out.println(plane);
            }
        }
    }

    //    Task 8. (score 10)
//    Create function:
//    Parameter array of Planes
//    Result: return the plane with minimal weight (if there are some of them return last one).
    public Plane printTask8(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeight() < min.getWeight()) {
                min = planes[i];
            }
        }
        return min;
    }

//    Task 9. (score 10)
//    Create function:
//    Parameter array of Planes
//    Result: return the plane with minimal cost from all military planes (if there are some of them return first one).

    public Plane printTask9(Plane[] planes) {
        Plane min = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getCost() < min.getCost() && planes[i].isMilitary()) {
                min = planes[i];
            }
        }
        return min;
    }
//    Task 10. (score 12)
//    Create function:
//    Parameter array of Planes
//    Result: print planes in ascending form order by year

    public void printTask10(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            for (int j = 0; j < planes.length - 1; j++) {
                if (planes[j].getYear() > planes[j + 1].getYear()) {
                    Plane t = planes[j];
                    planes[j] = planes[j + 1];
                    planes[j + 1] = t;
                }
            }
        }
        for (Plane x : planes) {
            System.out.print(x + " ");
        }
    }


}

