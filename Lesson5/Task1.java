package Lesson5;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

//Task: Створити функцію, яка може перетворити рядок на число double:

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть значення:");
        String value = sc.nextLine();

        if (value.matches("[0-9.]+")) {
            out.println("Значення double: " + convertToDouble(value));
        } else {
            out.println("Введене значення не є числом");
        }
    }
    public static double convertToDouble(String value){
        double convertionResult = Double.parseDouble(value);
        return convertionResult;
    }
}

