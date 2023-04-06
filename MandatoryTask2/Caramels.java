package MandatoryTask2;

public class Caramels extends Candy {
    private boolean containsFilling;

    public Caramels(String name, int weightOfOneCandyGram, int calorificPerGram, boolean containsFilling) {
        super(name, weightOfOneCandyGram, calorificPerGram);
        this.containsFilling = containsFilling;
    }

    public void setContainsFilling(boolean containsFilling) {
        this.containsFilling = containsFilling;
    }

    public boolean isFilled() {
        return containsFilling;
    }
}
