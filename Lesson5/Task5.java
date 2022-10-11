package Lesson5;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

// Task: Напишіть програму на Java для видалення певного елемента з масиву

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int[] testArray = new int[5];
        int[] newArray = new int[testArray.length - 1];

        out.println("Введіть масив з 5-ти цілих чисел:");
        for(int i = 0; i < testArray.length; i++) {
            testArray[i] = sc.nextInt();
        }
        out.println("Введіть існуюче значення, яке потрібно видалити з масиву:");
        int value = sc.nextInt();

        for (int i = 0, j = 0; i < testArray.length; i++) {
            if (i != (value - 1)) {
                newArray[j] = testArray[i];
                j++;
            }
        }
        out.println("Оновлений масив (не включає видалене значення): " + Arrays.toString(newArray));
    }
}
