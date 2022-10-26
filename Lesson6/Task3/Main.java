package Lesson6.Task3;

import Lesson6.Task3.Dog;

import java.util.Scanner;
import static java.lang.System.in;

// Task: Створити клас Dog. Додати поля на ваш розсуд та деякі методи.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        Dog dog1 = new Dog("Bim", 2, "Golden Retriever", false);
        Dog dog2 = new Dog("Barsik", 2, "Haski", true);

        System.out.println(dog1.print());
        System.out.println(dog2.print());
    }
}
