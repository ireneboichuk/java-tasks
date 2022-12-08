package Lesson11;

// Task 2:

public class InvalidValueException extends Exception {
    private String message;

    public InvalidValueException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}