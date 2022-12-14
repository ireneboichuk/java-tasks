package Lesson4;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

/* Task: Кожного місяця банк нараховує до суми вкладу 7% від суми. Напишіть консольну програму,
в яку користувач вводить суму вкладу та кількість місяців. А банк обчислює кінцеву суму вкладу
з урахуванням нарахування відсотків кожного місяця.Для обчислення суми з урахуванням відсотків
використовуйте цикл for.  */

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        out.println("Введіть значення суми вкладу:");
        double deposit = sc.nextInt();
        out.println("Введіть значення кількості місяців:");
        int months = sc.nextInt();

        for (int i = 0; i <= months; i++) {
            deposit += (deposit * 0.07);
        }
        out.println("Кінцева сума вкладу: " + (String.format("%.2f", deposit))); // результат заокруглено до 2-х знаків після коми
    }
}
