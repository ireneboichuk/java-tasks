package Lesson7.Task1;

public class Triangle extends Shape {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double a = side1 + side2 + side3;
        return a * (a - side1) * (a - side2) * (a - side3);
    }

    @Override
    public String toString() {
        return (
                "Периметр трикутника, см: " + this.getPerimeter() +
                ". Площа трикутника, см: " + this.getArea()
        );
    }
}
