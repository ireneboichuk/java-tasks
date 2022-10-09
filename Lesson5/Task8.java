package Lesson5;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

// Task: Напишіть програму на Java для пошуку спільних елементів між двома масивами цілих чисел

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть кількість елементів першого масиву:");
        int sizeValue1 = sc.nextInt();
        int[] array1 = new int[sizeValue1];
        out.println("Введіть перший масив цілих чисел в заданій раніше кількості:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }

        out.println("Введіть кількість елементів другого масиву:");
        int sizeValue2 = sc.nextInt();
        int[] array2 = new int[sizeValue2];
        out.println("Введіть другий масив цілих чисел в заданій раніше кількості:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }

        int index = 0;        // Отримання розміру третього масиву з спільними елементами
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    index++;
                }
            }
        }

        int[] array3 = new int[index];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    array3[count] = array1[i];
                    count++;
                }
            }
        }
        out.println("Масив спільних елементів: " + Arrays.toString(array3));
    }
}
