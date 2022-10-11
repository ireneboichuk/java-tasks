package Lesson5;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

/* Task: Напишіть програму на Java для обчислення середнього значення масиву цілих чисел,
   крім найбільшого та найменшого значень */

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть кількість елементів масиву:");
        int sizeValue = sc.nextInt();
        int[] testArray = new int[sizeValue];

        out.println("Введіть масив цілих чисел в заданій раніше кількості:");
        for(int i=0; i < testArray.length; i++) {
            testArray[i]=sc.nextInt();
        }
        Arrays.sort(testArray);

        int arraySum = 0;
        for (int i = 1; i <= (testArray.length - 2); i++) {
            arraySum += testArray[i];
        }
        out.println("Середнє значення масиву без найбільшого і найменшого значень: " +
                (arraySum / (testArray.length - 2)));
    }
}
