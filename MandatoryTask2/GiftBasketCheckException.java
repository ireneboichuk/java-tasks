package MandatoryTask2;

public class GiftBasketCheckException {
    private String message;

    public GiftBasketCheckException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
