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
        StringBuilder result =  new StringBuilder("");
        for (int i = 0; i < divided.length; i++) {
            if (divided[i].length() < 5) {
                result.append(divided[i] + " ");
            }
        }
        out.println("Оновлене значення: " + result.toString().trim());
    }
}
