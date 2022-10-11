package Lesson5;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

// Task: Створити програму яка рахує скільки разів зустрічається кожне слово в ній

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть значення рядка:");
        String stringValue = sc.nextLine();

        String[] divided = stringValue.split(" ");
        Arrays.sort(divided);
        out.println("Посортований масив: " + Arrays.toString(divided));

        for (int i = 1; i < divided.length; i++) {
            int number = 1;
            String word = divided[i - 1];
            if (divided[i].equals(word)) {
                for (; i < divided.length && divided[i].equals(word); i++) {
                    number++;
                }
            }
            out.println("Слово " + word + " повторюється вказану к-сть разів: " + number);
        }
    }
}
