package Lesson5;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

// Task: Напишіть програму на Java для перевірки рівності двох масивів. (двомірних)

public class Task10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть кількість рядків першого масиву:");
        int sizeValue1 = sc.nextInt();
        out.println("Введіть по два значення для кожного рядка даного масиву:");
        int[][] array1 = new int[sizeValue1][2];
        for (int i = 0; i < sizeValue1; i++) {
            array1[i] = new int[2];
            for (int j = 0; j < 2; j++) {
                array1[i][j] = sc.nextInt();
            }
        }

        out.println("Введіть кількість рядків другого масиву:");
        int sizeValue2 = sc.nextInt();
        out.println("Введіть по два значення для кожного рядка даного масиву:");
        int[][] array2 = new int[sizeValue2][2];
        for (int i = 0; i < sizeValue1; i++) {
            array2[i] = new int[2];
            for (int j = 0; j < 2; j++) {
                array2[i][j] = sc.nextInt();
            }
        }

        out.println("Результат перевірки порівняння: " + equals(array1, array2));
    }

    public static String equals (int[][] array1, int[][] array2){
        if(Arrays.deepEquals(array1, array2)){
            return("Масиви є рівні");
        } else {
            return("Масиви не є рівні");
        }
    }
}
