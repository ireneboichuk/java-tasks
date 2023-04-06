package MandatoryTask2;

import java.util.*;

public class Main {
    public static void main(String[] args) throws GiftBasketOvercalorificException, GiftBasketOverweightException, MaxCandyExceededException {

        Candy candy1 = RandomCandyGenerator.generateRandomCandy();
        Candy candy2 = RandomCandyGenerator.generateRandomCandy();
        Candy candy3 = RandomCandyGenerator.generateRandomCandy();
        Candy candy4 = RandomCandyGenerator.generateRandomCandy();
        Candy candy5 = RandomCandyGenerator.generateRandomCandy();

        // creating the Candy Gift Basket and adding some candies:
        CandyGiftBasket candyGiftBasket = new CandyGiftBasket();
        candyGiftBasket.addCandy(candy1);
        candyGiftBasket.addCandy(candy2);
        candyGiftBasket.addCandy(candy3);
        candyGiftBasket.addCandy(candy4);
        candyGiftBasket.addCandy(candy5);

        // weight of the Candy Gift Basket:
        System.out.println("Candy Gift Basket weight: " + candyGiftBasket.getCandyBasketWeightGrams());

        // Candy with the biggest weight:
        System.out.println("Weight of the biggest candy in the basket: " + candyGiftBasket.getCandyWithTheBiggestWeight());

        // Sorting by calorific:
        candyGiftBasket.sortCandiesByCalorific();

        // Remove one Candy from the Gift Basket:
        candyGiftBasket.removeCandy(candy4);

        // Existing candies:
        for (Candy candy : candyGiftBasket) {
            System.out.println(candy.toString());
        }
    }
}
