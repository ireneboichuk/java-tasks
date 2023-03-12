package MandatoryTask;

public class InvalidIndexException extends Exception{
    private String message;

    public InvalidIndexException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
