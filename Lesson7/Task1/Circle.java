package Lesson7.Task1;

public class Circle extends Shape {
    private int radius;
    private double circlePerimeter;
    private double circleArea;
    private final static double PI = 3.14;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        circlePerimeter = 2 * PI * this.radius;
        return circlePerimeter;
    }

    public double getArea() {
        circleArea = PI * (Math.pow(this.radius, 2));
        return circleArea;
    }

    @Override
    public String toString() {
        return (
                "Периметр кола, см: " + String.format("%.2f", circlePerimeter) +
                ". Площа кола, см: " + String.format("%.2f", circleArea)
        );
    }
}
