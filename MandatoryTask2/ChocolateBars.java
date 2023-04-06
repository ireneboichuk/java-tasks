package MandatoryTask2;

public class ChocolateBars extends Candy {
    private double chocolatePercentage;

    public ChocolateBars(String name, int weightOfOneCandyGram, int calorificPerGram, double chocolatePercentage) {
        super(name, weightOfOneCandyGram, calorificPerGram);
        this.chocolatePercentage = chocolatePercentage;
    }

    public double getChocolatePercentage() {
        return chocolatePercentage;
    }

    public void setChocolatePercentage(double chocolatePercentage) {
        this.chocolatePercentage = chocolatePercentage;
    }

    public boolean isBitterChocolateBar () {
        return chocolatePercentage > 80;
    }
}
