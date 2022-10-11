package Lesson5;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

// Task: Напишіть програму на Java для перевірки рівності двох масивів.

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть кількість елементів першого масиву:");
        int sizeValue1 = sc.nextInt();
        int[] array1 = new int[sizeValue1];
        out.println("Введіть перший масив цілих чисел в кількості: " + sizeValue1);
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }

        out.println("Введіть кількість елементів другого масиву:");
        int sizeValue2 = sc.nextInt();
        int[] array2 = new int[sizeValue2];
        out.println("Введіть другий масив цілих чисел кількості: " + sizeValue2);
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }

        out.println("Результат перевірки порівняння: " + equals(array1, array2));
    }

    public static String equals (int[] array1, int [] array2){
        if(Arrays.equals(array1, array2)){
            return("Масиви є рівні");
        } else {
            return("Масиви не є рівні");
        }
    }
}

