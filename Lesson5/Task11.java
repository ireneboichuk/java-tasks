package Lesson5;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

// Task 11: Напишіть програму на Java в якій видалити кожне слово довжиною 5 і більше символів

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть значення:");
        String value = sc.nextLine();

        String[] divided = value.split(" ");
        int number = 0;
        for (int i = 0; i < divided.length; i++) {
            if (divided[i].length() < 5) {
               number++;
            }
        }

        int j = 0;
        String[] result = new String[number];
        for (int i = 0; i < divided.length; i++) {
            if (divided[i].length() < 5) {
                result[j++] = divided[i];
            }
        }
        out.println("Оновлене значення: " + Arrays.toString(result));
    }
}
