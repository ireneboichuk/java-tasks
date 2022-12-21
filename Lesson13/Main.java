package Lesson13;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* Task 1: Обрати текст, записати його в змінну типу String. Кожне слово цього тексту помістити в колекцію.
        Вивести в консоль: загальну кількість слів. Вивести елементи колекції у виді (З допомогою ітератора).
        Кожен елемент колекції довжина якого більше 6, видалити цей елемент, а для елементів які менше 3 символів
        додати в кінець таких символів ’*’ щоб довжина була 3. Вивести колекцію (з допомогою for-each).
         */
        String str = "Дано N цілих чисел. Знайти суму трицифрових чисел, що є серед даного набору чисел";
        str = str.replaceAll("[^a-zA-Zа-яА-ЯіІїЇєЄҐґ ]", "");
        List<String> list = new ArrayList<>(List.of(str.split(" ")));
        System.out.println("Загальна кількість слів у Колеції #1: " + list.size());

        //Виведення колекції:
        System.out.println(list);

        //Виведення елементів колекції за допомогою ітератора:
        Iterator<String> iter1 = list.iterator();
        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }

        //Видалення елемента колекції, довжина якого більше 6 і додавання * до елементів довжиною менше 3:
        ListIterator<String> iter2 = list.listIterator();
        while (iter2.hasNext()) {
            String str2 = iter2.next();
            if (str2.length() > 6) {
                iter2.remove();
            } else if (str2.length() < 3) {
                iter2.set(str2.concat("*".repeat(3 - str2.length())));
            }
        }

        //Виведення елементів колекції за допомогою for:
        for (String string : list) {
            System.out.println(string);
        }


        /* Task 2: Текст з попереднього завдання помістити в іншу колекцію, вивести в консоль кількість унікальних слів.
        Вивести елементи колекції у впорядкованому виді. (З допомогою ітератора, та з допомогою for-each)
         */

        Set<String> set1 = new HashSet<>(list);
        System.out.println("Загальна кількість слів у Колеції #2: " + list.size()); //відкинуті слова, що повторюються (не враховуючи слова, після яких є кома / крапка тощо)

        Iterator<String> iter3 = set1.iterator();
        while (iter3.hasNext()) {
            System.out.println(iter3.next());
        }

        for (String string : set1) {
            System.out.println(string);
        }

        /* Task 3: Створити клас Student (age, fullName, telNumber, faculty (enum)). Створити 10 об'єктів цього типу
        та додати їх до колекції HashSet. Створити один об'єкт з ідентичними полями до іншого об'єкта, додати елемент
        до колекції та впевнитися що кількість об'єктів в колекції не змінилася.
         */
        Student student1 = new Student("Ivan", 25, 971234567, "MANAGEMENT");
        Student student2 = new Student("Vasyl", 24, 971234568, "MARKETING");
        Student student3 = new Student("Petro", 23, 971264567, "MATH");
        Student student4 = new Student("Yurii", 26, 978234567, "MANAGEMENT");
        Student student5 = new Student("Mykola", 24, 971294567, "COMPUTER_SCIENCE");
        Student student6 = new Student("Mykhailo", 22, 971034567, "COMPUTER_SCIENCE");
        Student student7 = new Student("Maksym", 21, 971234507, "MANAGEMENT");
        Student student8 = new Student("Oleh", 20, 971234560, "MARKETING");
        Student student9 = new Student("Taras", 29, 971214567, "MARKETING");
        Student student10 = new Student("Dmytro", 28, 971034567, "MATH");

        Set<Student> studentSetCollection = new HashSet<>();
        studentSetCollection.add(student1);
        studentSetCollection.add(student2);
        studentSetCollection.add(student3);
        studentSetCollection.add(student4);
        studentSetCollection.add(student5);
        studentSetCollection.add(student6);
        studentSetCollection.add(student7);
        studentSetCollection.add(student8);
        studentSetCollection.add(student9);
        studentSetCollection.add(student10);

        Student student11 = new Student("Taras", 29, 971214567, "MARKETING");
        studentSetCollection.add(student11);

        System.out.println("Загальна кількість елементів у Колеції студентів: " + studentSetCollection.size());

        Iterator<Student> iter4 = studentSetCollection.iterator();
        while (iter4.hasNext()) {
            System.out.println(iter4.next().print());
        }

    }
}
