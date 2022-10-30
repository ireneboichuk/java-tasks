package Lesson7.Task1;

public class Rectangle extends Shape {
    private int length;
    private int width;
    private int rectanglePerimeter;
    private double rectangleArea;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
            this.length = length;
        }
    public void setWidth(int width) {
            this.width = width;
        }

    public double getPerimeter() {
        rectanglePerimeter = 2 * (this.length + this.width);
        return rectanglePerimeter;
    }

    public double getArea() {
        rectangleArea = this.length * this.width;
        return rectangleArea;
    }

    @Override
    public String toString() {
        return (
                "Периметр прямокутника, см: " + rectanglePerimeter +
                ". Площа прямокутника, см: " + rectangleArea
        );
    }
}

