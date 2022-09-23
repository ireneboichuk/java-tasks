package Lesson4;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

/* Task: Передати на вхід програми число від 1 до 7 як аргумент. Якщо число дорівнює 1, виводимо
консоль “Понеділок”, 2 –”Вівторок” тощо. Якщо 6 або 7 - "Вихідний". Використовуючи if-else   */

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        out.println("Введіть число від 1 до 7:");
        int number = sc.nextInt();

        if (number == 1) {
            out.println("Понеділок");
        } else if (number == 2) {
            out.println("Вівторок");
        } else if (number == 3) {
            out.println("Середа");
        } else if (number == 4) {
            out.println("Четвер");
        } else if (number == 5) {
            out.println("П'ятниця");
        } else if (number == 6 || number == 7) {
            out.println("Вихідний");
        } else {
            out.println("Введене значення не відповідає вимогам");
        }
    }
}
