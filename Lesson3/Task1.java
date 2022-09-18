package Lesson3;

import static  java.lang.System.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        out.println("Введіть значення температури за шкалою Фаренгейта:");
        Scanner sc = new Scanner(in);
        double degreeFahrenheit = sc.nextDouble();

        out.println("Відповідне значення за шкалою Цельсія: " + convertToCelsius(degreeFahrenheit));
    }

    public static double convertToCelsius(double degreeFahrenheit){
        double convertionResult = (degreeFahrenheit - 32) * 5 / 9;
        return convertionResult;
    }
}