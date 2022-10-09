package Lesson5;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

//Task 12: В кожному слові рядка k-ту букву замінити на заданий символ

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть значення рядка:");
        String stringValue = sc.nextLine();
        out.println("Введіть індекс символа, який потрібно замінити в кожному слові:");
        int index = sc.nextInt();
        out.println("Введіть символ, яким потрібно замінити:");
        char s = sc.next().charAt(0);

        String[] divided = stringValue.split(" ");
        String[] result = new String[divided.length];
        for (int i = 0, j = 0; i < divided.length; i++) {
            if (divided[i].length() > index) {
                char symbolToReplace = divided[i].charAt(index);
                result[j++] = divided[i].replace(symbolToReplace, s);
            }
        }
        out.println("Оновлене значення рядка: " + Arrays.toString(result));
    }
}


