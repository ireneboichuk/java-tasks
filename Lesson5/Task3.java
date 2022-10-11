package Lesson5;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

// Task: Написати програму на Java для обчислення середнього значення елементів масиву.

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть кількість елементів масиву:");
        int sizeValue = sc.nextInt();
        int[] testArray = new int[sizeValue];

        out.println("Введіть масив цілих чисел в заданій раніше кількості:");
        for(int i=0; i < testArray.length; i++) {
            testArray[i]=sc.nextInt();
        }
        out.println("Масив введених чисел: " + (Arrays.toString(testArray))); // Для перевірки раніше введених значень

        int arraySum = 0;
        for (int i : testArray) {
            arraySum += i;
        }
        out.println("Середнє значення масиву введених чисел: " + (arraySum / testArray.length));
    }
}
