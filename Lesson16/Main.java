package Lesson16;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws Exception {

        /* Task 1: Проглянути Callable (Callable підтримує тип повернення при використанні з ExecutorService, йому
        часто надають перевагу над Runnable під час використання Concurrency API.). Написати приклад використання.
         */
        Callable<String> c1 = new CallableFromTask1("Callable 1");
        Callable<String> c2 = new CallableFromTask1("Callable 2");
        System.out.println(c1.call());
        System.out.println(c2.call());


        /* Task 2: Створити свій клас нащадок Thread, перевизначити метод run (виводити числа від 1 до 10).
        Створити 3 об'єкта потоки та запустити їх.
         */
        Thread thread1 = new ThreadFromTask2("Thread 1", 300);
        Thread thread2 = new ThreadFromTask2("Thread 2", 200);
        Thread thread3 = new ThreadFromTask2("Thread 3", 100);

        thread1.setPriority(Thread.MAX_PRIORITY);    // експеримент з пріоритетністю
        thread1.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MIN_PRIORITY);

        thread1.start();;
        thread2.start();
        thread3.start();


        /* Task 3: Друк парних і непарних чисел за допомогою двох thread. Щоб надрукувати парні та непарні числа
        за допомогою двох потоків, використайте синхронізований блок і метод notify().
         */
        Thread th1 = new EvenNumberTask3("EvenNumbersThread");
        Thread th2 = new OddNumberTask3("OddNumbersThread");

        th1.start();
        th2.start();

    }
}
