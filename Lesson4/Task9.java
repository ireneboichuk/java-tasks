package Lesson4;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

//  Task: Реалізувати підрахунок факторіалу для введеного числа з консолі, використовуючи цикл for

public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        out.println("Введіть ціле число:");
        int number = sc.nextInt();

        out.println("Знайдення факторіалу числа з використанням циклу for:");
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        out.println(number + "! = " + result);

        out.println("Знайдення факторіалу числа з використанням циклу while:");
        int n = 1;
        int sum = 1;
        while (n <= number) {
            sum *= n;
            n++;
        }
        out.println(number + "! = " + sum);
    }
}
