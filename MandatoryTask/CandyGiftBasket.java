package MandatoryTask;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CandyGiftBasket {
    private List<Candy> candyGiftBasket;

    public static void addCandy(Candy candy, List<Candy> candyGiftBasket) throws InvalidValueException {
        try {
            if(candy.getName() != null && candy.getWeightOfOneCandyGram() > 0 && candy.getCalorificPerGram() > 0) {
                candyGiftBasket.add(candy);
            } else {
                throw new InvalidValueException("Some candy values are invalid");
            }
        } catch (InvalidValueException e) {
            throw new InvalidValueException(e.getMessage());
        }
    }

    public static void removeCandy (int indexValue, List<Candy> candyGiftBasket) throws InvalidIndexException {
        try {
            if (0 < indexValue && indexValue < candyGiftBasket.size()) {
                candyGiftBasket.remove(indexValue);
            } else {
                throw new InvalidIndexException("Index value is invalid. Please, re-check it");
            }
        } catch (InvalidIndexException e) {
            throw new InvalidIndexException(e.getMessage());
        }
    }

    public static String getCandyBasketWeight(List<Candy> candyGiftBasket) throws InvalidValueException {
        try {
            int candyBasketWeight = 0;
            for (Candy candy : candyGiftBasket) {
                if (candy.getWeightOfOneCandyGram() > 0) {
                    candyBasketWeight += candy.getWeightOfOneCandyGram();
                } else {
                    throw new InvalidValueException("Candy weight value is invalid: " + candy.getName());
                }
            }
            return "Weight of the Candy Basket is: " + candyBasketWeight;
        } catch (InvalidValueException e) {
            throw new InvalidValueException("Candy weight value is invalid: " + e.getMessage());
        }
    }

    public static void sortCandiesByCalorific(List<Candy> candyGiftBasket) {
        candyGiftBasket.sort(Comparator.comparing(Candy::getCalorificPerGram));
        for (Candy candy : candyGiftBasket) {
            System.out.println(candy.getName() + " contains " + candy.getCalorificPerGram() + " calories per gram");
        }
    }

    public static String getCandyWithTheBiggestWeight(List<Candy> candyGiftBasket) throws NullPointerException {
        if (candyGiftBasket.isEmpty()) {
            throw new NullPointerException("Candy Gift Basket is empty");
        }

        Candy candyWithTheBiggestWeight = candyGiftBasket.get(0);
        for (Candy candy : candyGiftBasket) {
            if (candy.getWeightOfOneCandyGram() > candyWithTheBiggestWeight.getWeightOfOneCandyGram()) {
                candyWithTheBiggestWeight = candy;
            }
        }
        return "Candy with the biggest weight: " + candyWithTheBiggestWeight.getName();
    }
}
