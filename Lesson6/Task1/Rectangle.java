package Lesson6.Task1;

import static java.lang.System.out;

//Task: Створити клас прямокутник з полями довжина, ширина. Додати методи обчислення площі, периметру

public class Rectangle {
    private int length;
    private int width;
    private final String printAddValues = "Введіть значення ширини та довжини прямокутника (в см):";


    public Rectangle() {
    }

    public void setRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void print() {
        System.out.println(printAddValues);
    }

    public String getPerimeter(int length, int width) {
        return "Периметр для введених значень довжини та ширини прямокутника, см: " + (2 * (length + width));
    }

    public String getArea(int length, int width) {
        return "Площа для введених значень довжини та ширини прямокутника, см: " + (length * width);
    }

}