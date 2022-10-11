package Lesson5;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

// Task: В тексті кожну букву замінити її номером в алфавіті. Для англійського тексту, всі інші букви/символи замінити

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть значення рядка:");
        String stringValue = sc.nextLine();
        String[] divided = stringValue.split("");
        char[] letter = stringValue.toCharArray();

        String value = "^[a-zA-Z]$";
        for (int i = 0; i < stringValue.length(); i++) {
            if (divided[i].matches(value)) {
                divided[i] = String.valueOf(letter[i]);
            } else {
                divided[i] = "*";
            }
        }
        out.println("Оновлене значення:" + Arrays.toString(divided));
    }
}
