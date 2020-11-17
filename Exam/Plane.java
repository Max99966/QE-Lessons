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
        if (model != null){
            this.model = model;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null){
            this.country = country;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2020){
            this.year = year;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 10000){
            this.hours = hours;
        }
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
        if (weight >= 1000 && weight <= 160000){
            this.weight = weight;
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan >= 10 && wingspan <= 45){
            this.wingspan = wingspan;
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed >= 0){
            this.topSpeed = topSpeed;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats >= 0){
            this.seats = seats;
        }
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost >= 0){
            this.cost = cost;
        }
    }

}
