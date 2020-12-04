package ProjectTUMO;

public class NameException extends RuntimeException {
    @Override
    public String toString() {
        return "The first name and/or last name can not be blank";
    }
}
