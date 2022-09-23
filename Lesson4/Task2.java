package Lesson4;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

//Task: Вивести на екран кожне сьоме число в діапазоні до заданої межі включно:

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть ціле число більше 7, щоб отримати кожне сьоме число в діапазоні до заданої межі:");
        int number = sc.nextInt();

        if (number >= 7) {
            out.println("Виведення числа з використанням циклу for:");
            for (int i = 7; i <= number; i += 7) {
                out.println(i);
            }

            out.println("Виведення числа з використанням циклу while:");
            int n = 7;
            while (n < number) {
                out.println(n);
                n += 7;
            }
        } else {
            out.println("Ви ввели число, що не відповідає вимогам");
        }
    }
}
