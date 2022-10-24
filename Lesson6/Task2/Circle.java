package Lesson6.Task2;

public class Circle {
    private double radius;
    private final double PI = 3.14;
    private static final String printAddRadius = "Введіть значення радіусу (в см):";
    private static final String validationMessage = "Введене значення радіусу є невалідним";

    public Circle() {}

    public Circle(int radius) {
        this.radius = radius;
    }

    public static void print () {
        System.out.println(printAddRadius);
    }

    public static void printValidationMessage () {
        System.out.println(validationMessage);
    }
    public String getPerimeter(double radius) {
        return "Периметр кола: " + String.format("%.2f", (2 * PI * radius)) + "см";
    }

    public String getArea(double radius) {
        return "Площа кола: " + String.format("%.2f", (PI * (Math.pow(radius, 2)))) + "см";
    }
}
