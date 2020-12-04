package ProjectTUMO;

public class LocationException extends RuntimeException {
    @Override
    public String toString() {
        return "Wrong location, there are no TUMO Centers in that specific location as of right now.";
    }
}
