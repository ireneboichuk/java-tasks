package Lesson17;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        /* Tasks 1: Створити колекцію записати туда 100 рандомних значень.
               - Знайти суму непарних чисел у колекції.
               - Порахувати кількість парниих чисел
               - Тільки позитивні числа цієї колекції записати в нову колекцію
         */
        
        List<Integer> list = IntStream.iterate(0, i -> new Random().nextInt(100))
                .limit(100)
                .boxed().toList();

        Stream.of(list)
                .forEach(System.out::println);    // Виведення первинного вигляду Колекції рандомних чисел

        int oddNumbersSum = list.stream()
                .filter(number -> (number % 2) != 0)
                .mapToInt(number -> number)
                .sum();
        System.out.println("Сума непарних чисел: " + oddNumbersSum);

        long evenNumbers = list.stream()
                .filter(number -> (number % 2) == 0)
                .count();
        System.out.println("Кількість парних чисел: " + evenNumbers);

        List<Integer> listOfPositiveNumbers = list.stream()
                .filter(number -> (number > 0)).toList();

        System.out.println("Колекція позитивних чисел: " + listOfPositiveNumbers);


        // Task 2: Оголосити довільний масив рядків. Відсортувати елементи потоку за довжиною слова. Зберегти у колекцію.
        String str = "The forEach метод запускає внутрішню ітерацію елементів у потоці та підраховує елементи, які задовольняють задану умову";
        str = str.replaceAll("[^a-zA-Zа-яА-ЯіІїЇєЄҐґ ]", "");
        String[] list2 = str.split(" ");

        List<String> sortedStringArray = Arrays.stream(list2)
                .sorted(Comparator.comparingInt(String::length))
                .toList();
        System.out.println("Відсортовані за довжиною слова: " + sortedStringArray);


        /*  Task 3: Припустимо, у нас є колекція, що складається з рядків: Arrays.asList(«Highload», «High», «Load», «Highload»)
            Порахувати скільки разів частина "High" зустрічається в колекції
         */

        long countOfHigh = Stream.of(Arrays.asList("Highload", "High", "Load", "Highload"))
                .filter(i -> i.contains("High"))
                .count();
        System.out.println("Слова, що містять High: " + countOfHigh);


        /*  Task 4: Ввести текст в рядочок. З рядка створити колекцію.
	        - Порахувати кількість унікальних слів.
	        - Порахувати кількість слів довжина яких менша 3.
	        - всі слова написати задом-наперед, залишити тільки ті слова які мають довжину кратну двом.
	        - перевести всі слова у верхній регістр. Замінити у цих словах літеру O та A на символ решітку.
	        Відібрати тільки унікальні значення. Записати в колекцію мапу де ключ слово а значення його довжина.
         */

        String str3 = "Відібрати тільки унікальні значення. Записати в колекцію мапу де ключ слово а значення його довжина";
        str3 = str3.replaceAll("[^a-zA-Zа-яА-ЯіІїЇєЄҐґ ]", "");
        List<String> list3 = new ArrayList<>(List.of(str.split(" ")));

        long numberOfUniqueWords = list3.stream()
                .distinct()
                .count();
        System.out.println("Кількість унікальних слів: " + numberOfUniqueWords);

        long numberOfShortWords = list3.stream()
                .filter(i -> (i.length() < 3))
                .count();
        System.out.println("Кількість коротких слів довжиною менше 3-х символів: " + numberOfShortWords);

        List<StringBuilder> str4 = list3.stream()
                .filter(i -> (i.length() % 2 == 0))
                .map(i -> new StringBuilder(i).reverse())
                .toList();
        System.out.println("Слова задом наперед: " + str4);

        List<String> upperCaseList = list3.stream()
                .map(String::toUpperCase)
                .map(i -> i.replaceAll("[OAОА]", "#"))      //Для заміни вказано символи кирилицею та латиницею
                .toList();
        System.out.println("Слова в UpperCase: " + upperCaseList);

        Map<String, Integer> lastSubTask = list3.stream()
                .distinct()
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println("Нова колекція унікальних значень: " + lastSubTask);
    }
}
