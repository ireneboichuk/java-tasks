package Lesson5;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

/* Task: Напишіть програму, яка знаходить суму кожного числа від 1 до num. Число завжди буде додатним цілим числом,
 більшим за 0.  */

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть додатнє ціле число більше нуля:");
        int value = sc.nextInt();

        int result = 0;
        for (int i = 1; i <= value; i++) {
            result += i;
        }
        out.println("Значення суми кожного числа від 1 до введеного значення: " + result);
    }
}
