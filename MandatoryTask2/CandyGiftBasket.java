package MandatoryTask2;


import java.util.*;

public class CandyGiftBasket implements Iterable<Candy>{
    private List<Candy> candies;

    private int maxWeightInGram;
    private int maxCalorific;
    private int maxCandyCount;
    private static final int DEFAULT_MAX_WEIGHT_IN_GRAMS = 500;
    private static final int DEFAULT_MAX_CALORIFIC = 2500;
    private static final int DEFAULT_MAX_CANDY_COUNT = 10;
    public CandyGiftBasket(int maxWeightInGram, int maxCalorific, int maxCandyCount) {
        this.candies = new ArrayList<>();
        this.maxWeightInGram = getValueOrDefault(maxWeightInGram, DEFAULT_MAX_WEIGHT_IN_GRAMS);
        this.maxCalorific = getValueOrDefault(maxCalorific, DEFAULT_MAX_CALORIFIC);
        this.maxCandyCount = getValueOrDefault(maxCandyCount, DEFAULT_MAX_CANDY_COUNT);
    }
    public CandyGiftBasket() {
        this(DEFAULT_MAX_WEIGHT_IN_GRAMS, DEFAULT_MAX_CALORIFIC, DEFAULT_MAX_CANDY_COUNT);
    }
    private int getValueOrDefault(int value, int defaultValue) {
        return value >= 0 ? value : defaultValue;
    }

    public void addCandy(Candy candy) throws GiftBasketOvercalorificException, GiftBasketOverweightException, MaxCandyExceededException {
        try {
            verifyIsNotOverweight(candy);
            verifyIsNotOvercalorific(candy);
            verifyIsNotExceedMaxNumberOfCandies(candy);
            candies.add(candy);
        } catch (GiftBasketOvercalorificException | GiftBasketOverweightException | MaxCandyExceededException e) {
            System.err.println(e.getMessage());
        }
    }

    public void verifyIsNotOverweight (Candy candy) throws GiftBasketOverweightException {
        if (getCandyBasketWeightGrams() + candy.getWeightOfOneCandyGram() > maxWeightInGram){
            throw new GiftBasketOverweightException(String.format("The GiftBasket weight exceeds %d g", maxWeightInGram));
        }
    }

    public void verifyIsNotOvercalorific (Candy candy) throws GiftBasketOvercalorificException {
        int calorificOfOneCandy = candy.getWeightOfOneCandyGram() * candy.getCalorificPerGram();
        if ((getCandyBasketCalorific() + calorificOfOneCandy) > maxCalorific) {
            throw new GiftBasketOvercalorificException(String.format("The GiftBasket calorific exceeds %d g", maxCalorific));
        }
    }

    public void verifyIsNotExceedMaxNumberOfCandies (Candy candy) throws MaxCandyExceededException {
        if (candies.size() > maxCandyCount) {
            throw new MaxCandyExceededException(String.format("Candies count exceeds 10 in the GiftBasket %d g", maxCandyCount));
        }
    }

    public void removeCandy (Candy candy) {
        candies.remove(candy);
    }

    public int getCandyBasketWeightGrams() {
        return candies.stream()
                .mapToInt(Candy::getWeightOfOneCandyGram)
                .sum();
    }

    public int getCandyBasketCalorific() {
        return candies.stream()
                .mapToInt(candy -> candy.getWeightOfOneCandyGram() * candy.getCalorificPerGram())
                .sum();
    }

    public void sortCandiesByCalorific() {
        candies.sort(Comparator.comparing(Candy::getCalorificPerGram));
    }

    public Optional<Candy> getCandyWithTheBiggestWeight() {
        return candies.stream()
                .sorted(Comparator.comparing(Candy::getWeightOfOneCandyGram))
                .findAny();
    }

    @Override
    public Iterator<Candy> iterator() {
        return candies.iterator();
    }
}
