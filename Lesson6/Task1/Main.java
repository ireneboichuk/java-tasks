package Lesson6.Task1;

import java.util.Scanner;
import static java.lang.System.in;

//Task: Створити клас прямокутник з полями довжина, ширина. Додати методи обчислення площі, периметру

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        Rectangle newRectangle = new Rectangle();
        newRectangle.print();
        int length = sc.nextInt();
        int width = sc.nextInt();

        System.out.println(newRectangle.getPerimeter(length, width));
        System.out.println(newRectangle.getArea(length, width));
    }
}
