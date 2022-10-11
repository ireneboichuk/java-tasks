package Lesson5;

import java.text.Collator;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

// Task: метод сорт для масиву рядків, який буде сортувати IgnoreCase

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть значення:");
        String stringValue = sc.nextLine();

        String[] divided = stringValue.split(" ");
        out.println("Невідсортований список: " + Arrays.toString(divided));
        Arrays.sort(divided, Collator.getInstance());
        out.println("Відсортований список: " + Arrays.toString(divided));
    }
}