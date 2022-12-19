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
        out.println(new Main().checkIsEmpty().test(value));


        // Task 2: Написати метод, який повертає {@link Supplier}, який завжди надає "Hello"
        out.println("Task 2:");
        out.println(new Main().returnHello().get());


        /* Task 3: Написати метод, який повертає {@link Function}, яка приймає {@link String} і повертає цей рядок, що
        повторюється n разів, де n передається як аргумент функції */
        out.println("Task 3:");
        out.println("Введіть значення рядка:");
        String str = sc.nextLine();
        out.println("Введіть число для повторів рядка:");
        int number = sc.nextInt();
        out.println(new Main().returnStringNTimes(str).apply(number));


        // Task 4: Написати метод, який повертає {@link Supplier} випадкових цілих чисел
        out.println("Task 4:");
        out.println(new Main().randomIntNumbers(10).get());


        /* Task 5-1: Написати метод, який отримує два параметри, які представляють діапазон, і повертає {@link Predicate<String>},
        який перевіряє, чи довжина рядка відповідає вказаному діапазону. наприклад min <= length < max  */
        out.println("Task 5:");
        out.println(new Main().CheckStringLength1(2, 10).test("Test Test"));


        // Task 5-2 реалізація через новий функціональний інтерфейс:
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
        out.println(new Main().newText("test").get());
    }


    public static Predicate<String> checkIsEmpty () {
        return String::isEmpty;
    }

    public Supplier<String> returnHello () {
        return () -> "Hello!";
    }

    public Function<Integer, String> returnStringNTimes (String str) {
        return str::repeat;
    }

    public Supplier<Integer> randomIntNumbers (int bound) {
        return () -> new Random().nextInt(bound);
    }

    public Predicate<String> CheckStringLength1 (Integer min, Integer max) {
       return (String str) -> ((min <= str.length()) && (str.length() < max));
    }

    public Optional<String> newText (String str) {
        return Optional.of(str);
    }
}
