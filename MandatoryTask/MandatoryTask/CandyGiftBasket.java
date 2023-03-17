package MandatoryTask;

import java.util.*;

public class CandyGiftBasket {
    private List<Candy> candies;
    private final int MAX_WEIGHT_IN_GRAMS = 500;
    private final int MAX_CALORIFIC = 2500;
    private final int MAX_CANDY_COUNT = 10;

    public CandyGiftBasket() {
        candies = new ArrayList<>();
    }

    public void addCandy(Candy candy) throws GiftBasketOvercalorificException, GiftBasketOverweightException, MaxCandyExceededException, NullPointerException {
        if (candy.getName() != null && candy.getWeightOfOneCandyGram() > 0 && candy.getCalorificPerGram() > 0) {
            if (verifyIsNotOvercalorific(candy) && verifyIsNotOverweight(candy) && verifyIsNotExceedMaxNumberOfCandies(candy)) {
                candies.add(candy);
            } else if (!verifyIsNotOvercalorific(candy)) {
                throw new GiftBasketOvercalorificException("The GiftBasket calorific exceeds 2500 calories");
            } else if (!verifyIsNotOverweight(candy)) {
                throw new GiftBasketOverweightException("The GiftBasket weight exceeds 500g");
            } else if (!verifyIsNotExceedMaxNumberOfCandies(candy)) {
                throw new MaxCandyExceededException("Candy count exceeds 10 in the GiftBasket");
            }
        } else {
            throw new NullPointerException("Some candy values are empty or null. Please, re-check it");
        }
    }

    public boolean verifyIsNotOverweight (Candy candy) {
        if ((this.getCandyBasketWeightGrams() + candy.getWeightOfOneCandyGram()) < MAX_WEIGHT_IN_GRAMS) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyIsNotOvercalorific (Candy candy) {
        int calorificOfOneCandy = candy.getWeightOfOneCandyGram() * candy.getCalorificPerGram();
        if ((this.getCandyBasketCalorific() + calorificOfOneCandy) < MAX_CALORIFIC) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyIsNotExceedMaxNumberOfCandies (Candy candy) {
        int candyCount = 0;
        for (Candy c : candies) {
            if (c.getName().equals(candy.getName())) {
                candyCount++;
            }
        }

        if (candyCount <= MAX_CANDY_COUNT) {
            return true;
        } else {
            return false;
        }
    }

    public void removeCandy (Candy candy) throws NoSuchElementException {
        Iterator<Candy> iterator = candies.iterator();
        boolean candyFound = false;
        while (iterator.hasNext()) {
            Candy c = iterator.next();
            if (c.getName().equals(candy.getName())) {
                iterator.remove();
                candyFound = true;
                break;
            }
        }
        if (!candyFound) {
            throw new NoSuchElementException("The specified item is not in the list. Please, re-check it");
        }
    }

    public int getCandyBasketWeightGrams() {
        int candyBasketWeight = candies.stream()
                .mapToInt(Candy::getWeightOfOneCandyGram)
                .sum();
        return candyBasketWeight;
    }

    public int getCandyBasketCalorific() {
        int candyBasketCalorific = 0;
        for (Candy candy : candies) {
            candyBasketCalorific += candy.getWeightOfOneCandyGram() * candy.getCalorificPerGram();
        }
        return candyBasketCalorific;
    }

    public void sortCandiesByCalorific() {
        candies.sort(Comparator.comparing(Candy::getCalorificPerGram));
        for (Candy candy : candies) {
            System.out.println(candy.getName() + " contains " + candy.getCalorificPerGram() + " calories per gram");
        }
    }

    public String getCandyWithTheBiggestWeight() {
        Candy candyWithTheBiggestWeight = candies.get(0);
            for (Candy candy : candies) {
                if (candy.getWeightOfOneCandyGram() > candyWithTheBiggestWeight.getWeightOfOneCandyGram()) {
                    candyWithTheBiggestWeight = candy;
                }
            }
        return candyWithTheBiggestWeight.getName();
    }
}
