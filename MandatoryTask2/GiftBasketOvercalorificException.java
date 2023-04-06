package MandatoryTask2;

public class GiftBasketOvercalorificException extends Exception {
    private String message;

    public GiftBasketOvercalorificException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
