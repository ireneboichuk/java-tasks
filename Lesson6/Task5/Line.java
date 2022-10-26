package Lesson6.Task5;

import Lesson6.Task4.Point;

public class Line {
    private Point point1;
    private Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public String checkParallel(Line line) {
        int a, b, c, d;
        a = line.point2.getY() - line.point1.getY();
        b = line.point2.getX() - line.point1.getX();
        double slope1 = a / b;

        c = this.point2.getY() - this.point1.getY();
        d = this.point2.getX() - this.point1.getX();
        double slope2 = c / d;

        if (Double.compare(slope1, slope2) == 0) {
            return "Дані лінії є паралельними";
        } else {
            return "Дані лінії перетинаються";
        }
    }
}
