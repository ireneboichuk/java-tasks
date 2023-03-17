package MandatoryTask;

public class ChocolateBars extends Candy {
    private double chocolatePercentage;

    public ChocolateBars(String name, int weightOfOneCandyGram, int calorificPerGram, double chocolatePercentage) {
        super(name, weightOfOneCandyGram, calorificPerGram);
        this.chocolatePercentage = chocolatePercentage;
    }
}
