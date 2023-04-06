package MandatoryTask2;

import java.util.Comparator;
import java.util.Objects;

public abstract class Candy implements Comparable<Candy> {
    protected String name;
    protected int weightOfOneCandyGram;
    protected int calorificPerGram ;

    public Candy(String name, int weightOfOneCandyGram, int calorificPerGram) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("Candy name cannot be null or empty");
        }
        if (weightOfOneCandyGram <= 0 ) {
            throw new IllegalArgumentException("Candy weight cannot be 0 or less");
        }
        if (calorificPerGram <= 0 ) {
            throw new IllegalArgumentException("Candy calorificPerGram cannot be 0 or less");
        }
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
        return Comparator.comparingInt(Candy::getCalorificPerGram)
                .thenComparingInt(Candy::getWeightOfOneCandyGram)
                .compare(this, candy);
    }

    @Override
    public String toString() {
        return "Candies: " + this.name + ". Weight of one candy: " + this.weightOfOneCandyGram + " gram(s) " +
                "Calorific per gram: " + this.calorificPerGram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candy candy = (Candy) o;
        return weightOfOneCandyGram == candy.weightOfOneCandyGram && calorificPerGram == candy.calorificPerGram && Objects.equals(name, candy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weightOfOneCandyGram, calorificPerGram);
    }
}
