package MandatoryTask2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomCandyGenerator {
    private static final List<String> CHOCOLATE_BARS_CANDY_NAME = Arrays.asList("Snickers", "Bounty", "Milka", "Knoppers", "Roshen");
    private static final List<String> CARAMELS_CANDY_NAME = Arrays.asList("YumEarth", "Roshen Caramel", "Bim-Bom", "Salted Caramel", "Mint Caramel");
    private static final Random RANDOM = new Random();

    public static Caramels createRandomCaramel() {
        String name = CARAMELS_CANDY_NAME.get(RANDOM.nextInt(CARAMELS_CANDY_NAME.toArray().length));
        int weightOfOneCandyGram = RANDOM.nextInt(50) + 1;
        int calorificPerGram = RANDOM.nextInt(8) + 1;
        boolean containsFilling = RANDOM.nextBoolean();

        return new Caramels(name, weightOfOneCandyGram, calorificPerGram, containsFilling);
    }

    public static ChocolateBars createRandomChocolateBar() {
        String name = CHOCOLATE_BARS_CANDY_NAME.get(RANDOM.nextInt(CHOCOLATE_BARS_CANDY_NAME.toArray().length));
        int weightOfOneCandyGram = RANDOM.nextInt(50) + 1;
        int calorificPerGram = RANDOM.nextInt(10) + 1;
        int chocolatePercentage = RANDOM.nextInt(100) + 1;

        return new ChocolateBars(name, weightOfOneCandyGram, calorificPerGram, chocolatePercentage);
    }

    public static Candy generateRandomCandy () {
        if(RANDOM.nextInt(2) == 0) {
            return createRandomCaramel();
        } else {
            return createRandomChocolateBar();
        }
    }
}
