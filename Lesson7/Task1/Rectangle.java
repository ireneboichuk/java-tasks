package Lesson7.Task1;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return  "Периметр прямокутника, см: " + this.getPerimeter() +
                ". Площа прямокутника, см: " + this.getArea();
    }
}

