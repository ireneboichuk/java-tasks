package Lesson7.Task1;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        circle1.getArea();
        circle1.getPerimeter();
        System.out.println(circle1.toString());

        Shape rectangle1 = new Rectangle(2, 5);
        rectangle1.getArea();
        rectangle1.getPerimeter();
        System.out.println(rectangle1.toString());

        Shape triangle1 = new Triangle(3, 4, 5); //Такий спосіб створення об'єкта було взято з прикладу
        triangle1.getArea();
        triangle1.getPerimeter();
        System.out.println(triangle1.toString());
    }
}
