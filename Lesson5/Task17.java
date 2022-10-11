package Lesson5;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

// Task: метод який буде сортувати масив бульбашковим алгоритмом або сортування вставками (на ваш вибір)

public class Task17 {
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

        for (int i = 0; i < testArray.length; i++) {
            int value = testArray[i];
            int j = i - 1;
            for (; j >= 0 && testArray[j] < value; j--) {
                testArray[j + 1] = testArray[j];
            }
            testArray[j + 1] = value;
        }
        out.println("Відсортований масив введених чисел: " + (Arrays.toString(testArray)));
    }
}
