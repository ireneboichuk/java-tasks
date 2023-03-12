package MandatoryTask;

public class InvalidValueException extends Exception {
    private String message;

    public InvalidValueException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
