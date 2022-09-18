package Lesson3;

import static  java.lang.System.*;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Введіть перше ціле число:");
        int firstNum = sc.nextInt();
        out.println("Введіть друге ціле число:");
        int secondNum = sc.nextInt();
        out.println("Введіть третє ціле число:");
        int thirdNum = sc.nextInt();

        if ((firstNum != secondNum) && (firstNum != thirdNum) && (secondNum != thirdNum)) {
            if ((firstNum > secondNum) && (firstNum > thirdNum)) {
                out.println("Найбільше введене значення: " + firstNum);
                if ((secondNum > thirdNum)) {
                    out.println("Середнє введене значення: " + secondNum);
                    out.println("Найменше введене значення: " + thirdNum);
                } else if ((thirdNum > secondNum)) {
                    out.println("Середнє введене значення: " + thirdNum);
                    out.println("Найменше введене значення: " + secondNum);
                }
            } else if ((secondNum > firstNum) && (secondNum > thirdNum)) {
                out.println("Найбільше введене значення: " + secondNum);
                if ((thirdNum > firstNum)) {
                    out.println("Середнє введене значення: " + thirdNum);
                    out.println("Найменше введене значення: " + firstNum);
                } else if ((firstNum > thirdNum)) {
                    out.println("Середнє введене значення: " + firstNum);
                    out.println("Найменше введене значення: " + thirdNum);
                }
            } else if ((thirdNum > firstNum) && (thirdNum > secondNum)) {
                out.println("Найбільше введене значення: " + thirdNum);
                if ((secondNum > firstNum)) {
                    out.println("Середнє введене значення: " + secondNum);
                    out.println("Найменше введене значення: " + firstNum);
                } else if ((firstNum > secondNum)) {
                    out.println("Середнє введене значення: " + firstNum);
                    out.println("Найменше введене значення: " + secondNum);
                }
            }
        } else if (firstNum == secondNum && firstNum > thirdNum) {
            out.println("Найбільше значення було введено двічі: " + firstNum + "\nНайменше значення: "
                    + thirdNum);
        } else if (secondNum == thirdNum && secondNum > firstNum) {
            out.println("Найбільше значення було введено двічі: " + secondNum + "\nНайменше значення: "
                    + firstNum);
        } else if (thirdNum == firstNum && thirdNum > secondNum) {
            out.println("Найбільше значення було введено двічі: " + thirdNum + "\nНайменше значення: "
                    + secondNum);
        } else if (thirdNum == firstNum && thirdNum < secondNum) {
            out.println("Найбільше значення: " + secondNum + "\nНайменше значення було введено двічі: "
                    + thirdNum);
        } else if (firstNum == secondNum && firstNum < thirdNum) {
            out.println("Найбільше значення: " + thirdNum + "\nНайменше значення було введено двічі: "
                    + firstNum);
        } else if (thirdNum == firstNum && thirdNum < secondNum) {
            out.println("Найбільше значення: " + thirdNum + "\nНайменше значення було введено двічі: "
                    + secondNum);
        } else {out.println("Всі введені значення є рівними");}
    }
}