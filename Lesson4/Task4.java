package Lesson4;

import static java.lang.System.out;

/* Task: У країні R населення дорівнює 10 мільйонів людей. Народжуваність складає 14 осіб на 1000 осіб,
 смертність – 8 осіб. Розрахуйте, яка чисельність населення буде через 10 років, беручи до уваги,
 що показники народжуваності та смертності є постійними. */

public class Task4 {
    public static void main(String[] args) {

        int population = 1_000_000;
        int birthRate = 14;
        int mortalityRate = 8;

        for (int i = 0; i <= 10; i++) {
            int numberOfBirth = (population / 1000) * birthRate;
            int numberOfDead = (population / 1000) * mortalityRate;
            population += numberOfBirth - numberOfDead;
        }
        out.println("Через 10 років кількість населення становитиме: " + population + " осіб");
    }
}
