package Lesson4;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

/*  Task: Передати на вхід програми число від 1 до 7 як аргумент. Якщо число дорівнює 1, виводимо
консоль “Понеділок”, 2 –”Вівторок” тощо. Якщо 6 або 7 - "Вихідний". Використовуючи switch   */

public class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        out.println("Введіть число від 1 до 7:");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                out.println("Понеділок");
                break;
            case 2:
                out.println("Вівторок");
                break;
            case 3:
                out.println("Середа");
                break;
            case 4:
                out.println("Четвер");
                break;
            case 5:
                out.println("П'ятниця");
                break;
            case 6:
            case 7:
                out.println("Вихідний");
                break;
            default:
                out.println("Введене значення не відповідає вимогам");
        }
    }
}

