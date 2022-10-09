package Lesson5;

import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.in;
import static java.lang.System.out;

// Task: Напишіть програму на Java для знаходження максимального та мінімального значення масиву

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int[] testArray = new int[5];

        out.println("Введіть масив з 5-ти цілих чисел:");
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = sc.nextInt();
        }

        Arrays.sort(testArray);
        out.println("Мінімальне значення: " + testArray[0] + "; Максимальне значення: " + testArray[testArray.length - 1]);
    }
}