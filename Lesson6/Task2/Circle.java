package Lesson6.Task2;

public class Circle {
    private double radius;
    private static final double PI = 3.14;
    private static final String printAddRadius = "Введіть значення радіусу (в см):";

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(int radius) {
        this.radius = radius;
    }

    public static void print () {
        System.out.println(printAddRadius);
    }

    public String getPerimeter() {
        return "Периметр кола: " + String.format("%.2f", (2 * PI * this.radius)) + "см";
    }
    public String getArea() {
        return "Площа кола: " + String.format("%.2f", (PI * (Math.pow(this.radius, 2)))) + "см";
    }
}
