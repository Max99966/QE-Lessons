package ProjectTUMO.Exceptions;

public class GenderException extends RuntimeException {
    @Override
    public String toString() {
        return "Gender cannot be left blank";
    }
}
