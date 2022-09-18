package Lesson3;

import static  java.lang.System.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        out.println("Введіть значення довжини у дюймах:");
        Scanner sc = new Scanner(in);
        double lengthInches = sc.nextDouble();

        out.println("Відповідне значення в сантиметрах: " + convertToСentimeters(lengthInches));
    }
    public static double convertToСentimeters(double lengthInches){
        double convertionResult = lengthInches * 2.54;
        return convertionResult;
    }
}
