package Lesson3;

import java.util.Scanner;
import static java.lang.System.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть ціле число:");
        int number;
        int sum = 0;

        for (number = sc.nextInt(); number !=0; number /= 10) {
            sum = sum + (number % 10);
        }

        out.println("Сума цифр введеного числа: " + sum);

    }
}
