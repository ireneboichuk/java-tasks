package Lesson6.Task2;

import java.util.Scanner;
import static java.lang.System.in;

// Task: Створити клас коло з полями радіус, та константа PI.  Додати методи обчислення площі, периметру.

public class Main {
    private static final String printValidationMessage = "Введене значення радіусу є невалідним";

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        Circle.print();
        int radius = sc.nextInt();
        Circle newCircle = new Circle(radius);
        if (radius > 0) {
            System.out.println(newCircle.getPerimeter());
            System.out.println(newCircle.getArea());
        } else {
            System.out.println(printValidationMessage);
        }
    }
}
