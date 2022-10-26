package Lesson6.Task1;

//Task: Створити клас прямокутник з полями довжина, ширина. Додати методи обчислення площі, периметру

public class Rectangle extends Shape{
    private int length;
    private int width;
    private static final String printAddValues = "Введіть значення ширини та довжини прямокутника (в см):";

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

    public static void print() {
        System.out.println(printAddValues);
    }

    @Override
    public String getPerimeter() {
        return "Периметр для введених значень довжини та ширини прямокутника, см: " + (2 * (this.length + this.width));
    }

    @Override
    public String getArea() {
        return "Площа для введених значень довжини та ширини прямокутника, см: " + (this.length * this.width);
    }
}