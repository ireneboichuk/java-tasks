package Lesson5;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

// Task: Напишіть програму на Java для видалення повторюваних елементів з масиву

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        out.println("Введіть кількість елементів масиву:");
        int sizeValue = sc.nextInt();
        int[] array = new int[sizeValue];
        out.println("Введіть масив цілих чисел в заданій раніше кількості:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]){
                    number++;
                }
            }
        }

        int[] newArray = new int[number];
        out.println("Number: " + number);
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]){
                    newArray[counter] = array[i];
                    counter++;
                }
            }
        }
        out.println("Оновлений масив без дубльованих значень: " + Arrays.toString(newArray));
    }
}
