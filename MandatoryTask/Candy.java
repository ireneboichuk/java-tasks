package MandatoryTask;

public abstract class Candy implements Comparable<Candy> {
    private String name;
    private int weightOfOneCandyGram;
    private int calorificPerGram ;

    public Candy(String name, int weightOfOneCandyGram, int calorificPerGram) {
        this.name = name;
        this.weightOfOneCandyGram = weightOfOneCandyGram;
        this.calorificPerGram = calorificPerGram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeightOfOneCandyGram() {
        return weightOfOneCandyGram;
    }

    public void setWeightOfOneCandyGram(int weightOfOneCandyGram) {
        this.weightOfOneCandyGram = weightOfOneCandyGram;
    }

    public int getCalorificPerGram() {
        return calorificPerGram;
    }

    public void setCalorificPerGram(int calorificPerGram) {
        this.calorificPerGram = calorificPerGram;
    }

    @Override
    public int compareTo(Candy candy) {
        if (Integer.compare(this.calorificPerGram, candy.calorificPerGram) != 0) {
            return (Integer.compare(this.calorificPerGram, candy.calorificPerGram));
        } else {
            return Integer.compare(this.weightOfOneCandyGram, candy.weightOfOneCandyGram);
        }
    }

    @Override
    public String toString() {
        return "Candies: " + this.name + ". Weight of one candy: " + this.weightOfOneCandyGram + " gram(s) " +
                "Calorific per gram: " + this.calorificPerGram;
    }
}
