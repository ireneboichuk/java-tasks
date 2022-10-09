package Lesson5;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

// Task: В тексті якщо слово закінчується на задані символи додати за цим словом задане слово

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть значення рядка:");
        String stringValue = sc.nextLine();
        out.println("Введіть 2 символи, на які може закінчуватись слово, щоб додати після нього задане слово:");
        String endSymbols1 = sc.nextLine();
        out.println("Введіть слово, яке потрібно додати якщо слово закінчується на задані символи:");
        String wordToAdd = sc.nextLine();

        String[] divided = stringValue.split(" ");
        int number = divided.length;
        String[] result = new String[number];
        for (int i = 0, j = 0; i < divided.length; i++, j++) {
            String endSymbols3 = divided[i].substring(divided[i].length() - 2);
            if (endSymbols3.equals(endSymbols1)) {
                result[j] = divided[i] + " " + wordToAdd;
            } else {
                result[j] = divided[i];
            }
        }
        out.println("Оновлене значення рядка: " + Arrays.toString(result));
    }
}
