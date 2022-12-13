package Lesson12;

import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.function.*;
import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        // Task 1: Написати метод, який повертає {@link Predicate} рядка, який перевіряє, чи рядок порожній
        out.println("Task 1:");
        Scanner sc = new Scanner(in);
        out.println("Введіть значення рядка для перевірки:");
        String value = sc.nextLine();
        Predicate<String> checkIsEmpty = str -> str.isEmpty();   // OR method reference can be used instead: String::isEmpty;
        out.println("Введене значення є пустим: " + checkIsEmpty.test(value));


        // Task 2: Написати метод, який повертає {@link Supplier}, який завжди надає "Hello"
        out.println("Task 2:");
        Supplier<String> hi = () -> "Hello!";
        out.println(hi.get());


        /* Task 3: Написати метод, який повертає {@link Function}, яка приймає {@link String} і повертає цей рядок, що
        повторюється n разів, де n передається як аргумент функції */
        out.println("Task 3:");
        out.println("Введіть значення рядка:");
        String str = sc.nextLine();
        out.println("Введіть число для повторів рядка:");
        int number = Integer.valueOf(sc.nextInt());
        BiFunction<Integer, String, String> returnStringNTimes = (Integer num, String strr) -> {
                return (strr.repeat(num) + "\n");
        };
        out.println(returnStringNTimes.apply(number, str));


        // Task 4: Написати метод, який повертає {@link Supplier} випадкових цілих чисел
        out.println("Task 4:");
        Supplier<Integer> intRandomNumbers = () -> new Random().nextInt(100);
        out.println("Введіть кількість чисел для виведення:");
        int numberOfNumbers = sc.nextInt();
        for (int i = 0; i < numberOfNumbers; i++) {
            out.println(intRandomNumbers.get());
        }


        /* Task 5: Написати метод, який отримує два параметри, які представляють діапазон, і повертає {@link Predicate<String>},
        який перевіряє, чи довжина рядка відповідає вказаному діапазону. наприклад min <= length < max  */
        out.println("Task 5:");
        @FunctionalInterface
        interface CheckStringLength <T, U, V, R> {
            R apply (T t, U u, V v);
        }

        CheckStringLength <Integer, Integer, String, Boolean> checkLength = (Integer min, Integer max, String str3) -> {
            return min <= str3.length() && str3.length() < max;
        };
        out.println("Довжина рядка відповідає вказаному діапазону: " + checkLength.apply(2, 25, "TEST TEST"));


        // Task 6: Написати метод, який cтворює екземпляр {@link Optional<String>} за допомогою текстового параметра String
        out.println("Task 6:");
        Optional<String> newText = Optional.of("test");
        out.println(newText.get());
    }
}
