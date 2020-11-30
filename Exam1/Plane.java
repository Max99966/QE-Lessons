package Exam1;

public class Plane {
    private String model = "Model";
    private String country = "Country";
    private int year = 1903;
    private int hours = 300 ;
    private boolean military;
    private int weight = 1000;
    private int wingspan = 10;
    private int topSpeed = 1230 ;
    private int seats = 210;
    private double cost = 385.5;

    public Plane(String model, String country, int year, int hours, boolean military, int weight, int wingspan, int topSpeed, int seats, double cost) {
        setModel(model);
        setCountry(country);
        setYear(year);
        setHours(hours);
        setMilitary(military);
        setWeight(weight);
        setWingspan(wingspan);
        setTopSpeed(topSpeed);
        setSeats(seats);
        setCost(cost);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.length() > 0) {
            this.model = model;
        } else {
            System.out.println("Model should not be empty");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.length() > 0) {
            this.country = country;
        } else {
            System.out.println("Model should not be empty");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1903 && year <= 2020) {
            this.year = year;
        } else {
            System.out.println("Year must be from 1903 to 2020");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 10000) {
            this.hours = hours;
        } else {
            System.out.println("Hours should be from 0 to 10,000");
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
        if (weight >= 1000 && weight <= 160000) {
            this.weight = weight;
        } else {
            System.out.println("Weight should be from 1,000 to 160,000 KG");
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan >= 10 && wingspan <= 45) {
            this.wingspan = wingspan;
        } else {
            System.out.println("Wingspan should be from 10 to 45");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed >= 0) {
            this.topSpeed = topSpeed;
        } else {
            System.out.println("Top Speed should be a number greater or equal to 0");
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats >= 0) {
            this.seats = seats;
        } else {
            System.out.println("Seats should be a number greater or equal to 0");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        } else {
            System.out.println("Cost should be a number greater or equal to 0");
        }
    }

}
