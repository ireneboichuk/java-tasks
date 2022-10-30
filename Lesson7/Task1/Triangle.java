package Lesson7.Task1;

public class Triangle extends Shape {
    private int side1;
    private int side2;
    private int side3;
    private double trianglePerimeter;
    private double triangleArea;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }
    public void setSide2(int side2) {
        this.side2 = side2;
    }
    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        trianglePerimeter = side1 + side2 + side3;
        return trianglePerimeter;
    }

    public double getArea() {

        return triangleArea;
    }

    @Override
    public String toString() {
        return (
                "Периметр трикутника, см: " + trianglePerimeter +
                ". Площа трикутника, см: " + triangleArea
        );
    }
}
