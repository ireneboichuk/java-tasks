package MandatoryTask;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InvalidValueException, NotFoundException, InvalidIndexException, RuntimeException {

        KitKat kitKatStandard = new KitKat("kitKatStandard", 40, 5);
        MAndMs mAndMsStandard = new MAndMs("mAndMsStandard", 20, 2);
        Snickers snickersStandard = new Snickers("snickersStandard", 50, 6);

        // creating the Candy Gift Basket and adding some candies:
        List<Candy> candyGiftBasket = new ArrayList<>();
        try{
            CandyGiftBasket.addCandy(kitKatStandard, candyGiftBasket);
            CandyGiftBasket.addCandy(mAndMsStandard, candyGiftBasket);
            CandyGiftBasket.addCandy(snickersStandard, candyGiftBasket);
        } catch (InvalidValueException e) {
            System.out.println("Pay attention: " + e);
        }

        // weight of the Candy Gift Basket:
        try {
            System.out.println(CandyGiftBasket.getCandyBasketWeight(candyGiftBasket));
        } catch (InvalidValueException e) {
            System.out.println("Pay attention: " + e);
        } catch (RuntimeException e) {
            throw new RuntimeException();
        }

        // Candy with the biggest weight
        try {
            System.out.println(CandyGiftBasket.getCandyWithTheBiggestWeight(candyGiftBasket));
        } catch (NullPointerException e) {
            System.out.println("Pay attention: " + e);
        }

        // Sorting by calorific:
        CandyGiftBasket.sortCandiesByCalorific(candyGiftBasket);

        // Remove one Candy from the Gift Basket:
        try {
            CandyGiftBasket.removeCandy(2, candyGiftBasket);
        } catch (InvalidIndexException e) {
            System.out.println("Pay attention: " + e);
        }
    }
}
