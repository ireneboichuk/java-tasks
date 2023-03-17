package MandatoryTask;

public class MaxCandyExceededException extends Exception{
    private String message;

    public MaxCandyExceededException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
