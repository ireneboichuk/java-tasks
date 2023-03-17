package MandatoryTask;

public class Caramels extends Candy {
    private boolean containsFilling;

    public Caramels(String name, int weightOfOneCandyGram, int calorificPerGram, boolean containsFilling) {
        super(name, weightOfOneCandyGram, calorificPerGram);
        this.containsFilling = containsFilling;
    }
}
