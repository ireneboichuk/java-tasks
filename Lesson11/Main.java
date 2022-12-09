package Lesson11;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static <С> void main(String[] args) throws InvalidValueException {

        /* Task 1: Створіть клас із main(), який викидає об’єкт класу Exception у блок try. Надайте конструктору для винятку
        рядковий аргумент. Перехопити виняток у блоці catch і надрукувати аргумент String. Додайте блок finally і надрукуйте
        повідомлення, щоб підтвердити, що ви були там. */

        ClassToCheckExceptions.CheckValueFromTask1 dayValue1 = new ClassToCheckExceptions.CheckValueFromTask1("MONDAY");
        dayValue1.checkDay();
        ClassToCheckExceptions.CheckValueFromTask1 dayValue2 = new ClassToCheckExceptions.CheckValueFromTask1("TEST");
        dayValue2.checkDay();


        /* Task 2: Створіть власний клас винятків, використовуючи ключове слово extends. Напишіть конструктор для цього класу,
        який приймає аргумент String і зберігає його всередині об’єкта з посиланням String. Напишіть метод, який виводить
        збережений рядок. Створіть try-catch блок, щоб використати ваш новий виняток. */

        Scanner sc1 = new Scanner(in);
        ClassToCheckExceptions.CheckValueFromTask2 value1 = new ClassToCheckExceptions.CheckValueFromTask2();
        ClassToCheckExceptions.CheckValueFromTask2.print();
        value1.setValue(sc1.nextInt());

        try {
            value1.checkValue();
        } catch (InvalidValueException e) {
            System.out.println("Pay attention: " + e);;
        }


        /* Task 3: Напишіть клас із методом, який кидає виняток типу, створеного у завдані 2. Спробуйте скомпілювати його без
        специфікації винятку, щоб побачити, що каже компілятор. Додайте відповідну специфікацію винятку. Спробуйте свій клас
        і його винятки в блоці try-catch. */

        Scanner sc2 = new Scanner(in);
        ClassToCheckExceptions.CheckValueFromTask3 value2 = new ClassToCheckExceptions.CheckValueFromTask3();
        ClassToCheckExceptions.CheckValueFromTask3.print();
        value1.setValue(sc2.nextInt());

        try {
            value2.checkValue();
        } catch (InvalidValueException e) {
            System.out.println("Pay attention: " + e);;
        } catch (RuntimeException c) {
            System.out.println("This is Runtime exception");
        } finally {
            System.out.println("This is a Finally block");
        }


        /* Task 4: Створіть об’єкт та ініціалізуйте його значенням null. Спробуйте викликати метод через цей об'єкт.
        Тепер оберніть код у блок try-catch, щоб перехопити виняток. */

        ClassToCheckExceptions.CheckValueFromTask2 value3 = new ClassToCheckExceptions.CheckValueFromTask2();
        value3.setValue(null);
        try {
            value3.checkValue();    // Повідомлення про помилку з Unhandled exception з'являється, якщо не обгорнути таке значення в try / catch
        } catch (InvalidValueException e) {
            throw new RuntimeException(e);
        }


        /* Task 5: Створіть трирівневу ієрархію винятків. Створіть базовий клас A з методом, який кидає виключення.
        Успадкуйте B від A та перевизначте метод, щоб він кидав виняток на другому рівні вашої ієрархії. Повторіть,
        успадкувавши клас C від B. У main() створіть C і переведіть його до A, а потім викличте метод. */
        Scanner sc = new Scanner(in);
        out.println("Введіть ділене (value1):");
        int value11 = sc.nextInt();
        out.println("Введіть дільник (value2):");
        int value22 = sc.nextInt();

        C c = new C(value11, value22);
        A a = c;
        out.println(c.divisionOperation(value11, value22));
    }
}
