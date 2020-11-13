package Exam;

public class Plane {
    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean military;
    private int weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private int cost;

    public Plane() {
    }

    public Plane(String model,String country,int year, int hours,boolean military,int weight,int wingspan,int topSpeed,int  seats, int cost) {
        this.model= model;
        this.country= country;
        this.year = year;
        this.hours = hours;
        this.military = military;
        this.weight = weight;
        this.wingspan = wingspan;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    //    Task 1.
//    Create function:
//    Parameter one Plane
//    Result: print all information of the plane

    public void printInfo() {
        System.out.println("Model: " + model);
        System.out.println("Country: " + country);
        System.out.println("Year: " + year);
        System.out.println("Hours: " + hours);
        System.out.println("Military: " + (military ? "Yes" : "No"));
        System.out.println("Weight: " + weight);
        System.out.println("Wingspan: " + wingspan);
        System.out.println("Top Speed: " + topSpeed);
        System.out.println("Seats: " + seats);
        System.out.println("Cost: " + cost + " $");
    }

}
