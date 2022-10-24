package Lesson6.Task4;

import Lesson6.Task4.Point;
import java.util.Scanner;
import static java.lang.System.in;

// Task: Створити клас Point з полями X, Y та методом підрахунку відстані з іншим об'єктом даного типу.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        Point.print1();
        int x = sc.nextInt();
        int y = sc.nextInt();
        Point point1 = new Point(x, y);

        Point.print2();
        int a = sc.nextInt();
        int b = sc.nextInt();
        Point point2 = new Point(a, b);

        System.out.println(point1.determineDistance(a, b));
    }
}
