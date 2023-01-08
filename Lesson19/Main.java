package Lesson19;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /* Task 1: Створити файлик з текстом. Записати туда текст. Зчитати дані з файлу, всі слова більше 5 символів видалити.
        І перезаписати текст в той самий файл.
         */
        File file1 = new File("/Users/ireneboichuk/IdeaProjects/JavaTask/src/Lesson19/task1.txt");
        String data = "В кожному слові тексту k-у літеру замінити вказаним символом. Якщо k більше довжини слова, коригування не виконувати";

        try (FileWriter fileWriter = new FileWriter(file1)) {
           fileWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> text;
        try (BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file1))) {
                text = Arrays.stream(bufferedReader2.readLine().split(" ")).toList();
                text = text.stream()
                        .filter(i -> (i.length() <= 5))
                        .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter bufferedWriter2 = new FileWriter(file1, false)) {

            bufferedWriter2.write(text.toString());
        }


            // Task 2: Записати поточну дату і час у файл з назвою, date.txt
        File file4 = new File("/Users/ireneboichuk/IdeaProjects/JavaTask/src/Lesson19/date.txt");
        LocalDateTime localDateTime = LocalDateTime.now();

        try (FileWriter fileWriter = new FileWriter(file4)) {
            fileWriter.write(localDateTime.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
