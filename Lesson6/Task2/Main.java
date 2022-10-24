package Lesson6.Task2;

import java.util.Scanner;
import static java.lang.System.in;

// Task: Створити клас коло з полями радіус, та константа PI.  Додати методи обчислення площі, периметру.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        Circle newCircle = new Circle();
        Circle.print();
        int radius = sc.nextInt();
        if (radius > 0) {
            System.out.println(newCircle.getPerimeter(radius));
            System.out.println(newCircle.getArea(radius));
        } else {
            Circle.printValidationMessage();
        }
    }
}
