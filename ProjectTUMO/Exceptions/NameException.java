package ProjectTUMO.Exceptions;

public class NameException extends RuntimeException {
    @Override
    public String toString() {
        return "The first name and/or last name can not be blank, the name should only contain letters with the first letter being capital.";
    }
}
