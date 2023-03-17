package MandatoryTask;

public class GiftBasketOverweightException extends Exception {
    private String message;

    public GiftBasketOverweightException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
