package Lesson4;

import static java.lang.System.out;

// Task: Вивести табличку множення на 4

public class Task1 {
    public static void main(String[] args) {
        out.println("Таблиця множення числа 4 з використанням циклу while:" );
        int count = 0;
        while (count < 11) {
            out.println("4 * " + count + " = " + (4 * count));
            count++;
        }

        out.println("Таблиця множення числа 4 з використанням циклу for:");
        for (int i = 0; i < 11; i++) {
            out.println("4 * " + i + " = " + (4 * i));
        }

        out.println("Таблиця множення числа 4 з використанням циклу do-while:");
        int counter = 0;
        do{
            out.println("4 * " + counter + " = " + (4 * counter));
            counter++;
        } while(counter < 11);
    }
}
