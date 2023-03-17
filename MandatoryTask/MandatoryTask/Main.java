package MandatoryTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ChocolateBars kitKat = new ChocolateBars("KitKat Standard", 40, 5, 40);
        ChocolateBars snickers = new ChocolateBars("Snickers Standard", 50, 6, 38);
        ChocolateBars mars = new ChocolateBars("Mars Standard", 63, 8, 41);
        Caramels milkCaramel = new Caramels("TheCow", 10, 5, false);
        Caramels fruitCaramel = new Caramels("Frutti", 12, 4, true);

        // creating the Candy Gift Basket and adding some candies:
        CandyGiftBasket candyGiftBasket = new CandyGiftBasket();
        try{
            candyGiftBasket.addCandy(kitKat);
            candyGiftBasket.addCandy(snickers);
            candyGiftBasket.addCandy(mars);
            candyGiftBasket.addCandy(milkCaramel);
            candyGiftBasket.addCandy(fruitCaramel);
        } catch (GiftBasketOverweightException e) {
            System.out.println("Pay attention: " + e);
        } catch (GiftBasketOvercalorificException e) {
            System.out.println("Pay attention: " + e);
        } catch (MaxCandyExceededException e) {
            System.out.println("Pay attention: " + e);
        } catch (NullPointerException e) {
            System.out.println("Pay attention: " + e);
        }

        // weight of the Candy Gift Basket:
        System.out.println("Candy Gift Basket weight: " + candyGiftBasket.getCandyBasketWeightGrams());

        // Candy with the biggest weight
        System.out.println("Weight of the biggest candy in the basket: " + candyGiftBasket.getCandyWithTheBiggestWeight());

        // Sorting by calorific:
        candyGiftBasket.sortCandiesByCalorific();

        // Remove one Candy from the Gift Basket:
        try {
            candyGiftBasket.removeCandy(snickers);
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }
    }
}
