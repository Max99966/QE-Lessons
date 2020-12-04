package Lesson10;

public class AgeException extends RuntimeException{

    @Override
    public String toString() {
        return "Age can't be negative number";
    }
}
