package Lesson7.Task1;

public class Circle extends Shape {
    private int radius;
    private final static double PI = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    @Override
    public double getArea() {
        return PI * (Math.pow(this.radius, 2));
    }

    @Override
    public String toString() {
        return (
                "Периметр кола, см: " + String.format("%.2f", this.getPerimeter()) +
                ". Площа кола, см: " + String.format("%.2f", this.getArea())
        );
    }
}
