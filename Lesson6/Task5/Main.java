package Lesson6.Task5;

import Lesson6.Task4.Point;
import java.util.Scanner;
import static java.lang.System.in;

//Task: На основі раніше створеного класу Point створити клас Line, додати метод який перевіряє чи дана лінія паралельна іншій.

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

        Point point3 = new Point(20, 4);
        Point point4 = new Point(60, 8);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line (point3, point4);
        System.out.println(line1.checkParallel(line2));
    }
}
