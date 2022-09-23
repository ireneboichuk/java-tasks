package Lesson4;

import static java.lang.System.out;

// Task: Вивести на екран послідовність чисел: 1 2 4 8 16 32 64 128 256 512

public class Task3 {
    public static void main(String[] args) {
        out.println("Послідовність чисел, виведена за допомогою циклу for: ");
        int number = 2;
        int result;
        for(int exponent = 0; exponent < 10; exponent++) {
            result = (int) Math.pow(number, exponent);
            out.println(result + " ");
        }

        out.println("Послідовність чисел, виведена за допомогою циклу while:");
        int value = 2;
        int i = 0;
        while (i < 10) {
            int outcome = (int) Math.pow(value, i);
            out.println(outcome + " ");
            i++;
        }
    }
}
