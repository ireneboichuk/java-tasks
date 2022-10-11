package Lesson5;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

// Task: Напишіть програму на Java, щоб перевірити, чи містить масив певне значення

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть кількість елементів масиву:");
        int sizeValue = sc.nextInt();
        int[] testArray = new int[sizeValue];

        out.println("Введіть масив цілих чисел в заданій раніше кількості:");
        for(int i = 0; i < testArray.length; i++) {
            testArray[i] = sc.nextInt();
        }

        out.println("Введіть значення, яке потрібно знайти в масиві:");
        int value = sc.nextInt();
        int number = 0;
        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] == value) {
                number++;
            }
        }

        if (number > 0) {
            out.println("Значення " + value + " зустрічається в масиві " + number + " раз/-ів");
        } else {
            out.println("Значення " + value + " відсутнє у масиві");
        }
    }
}
