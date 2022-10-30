package Lesson7.Task2;

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse("Скакун", 5);
        Animal lion = new Lion("Лев", 3);
        Animal mouse = new Mouse("Мишка", 1);
        Python python = new Python("Піт", 2);

        System.out.println(horse.toString());
        System.out.println(horse.toEat());
        System.out.println(horse.toRun());
        System.out.println(horse.toSleep());
        System.out.println(horse.toSpeak());

        System.out.println(lion.toString());
        System.out.println(lion.toEat());
        System.out.println(lion.toRun());
        System.out.println(lion.toSleep());
        System.out.println(lion.toSpeak());

        System.out.println(mouse.toString());
        System.out.println(mouse.toEat());
        System.out.println(mouse.toRun());
        System.out.println(mouse.toSleep());
        System.out.println(mouse.toSpeak());

        System.out.println(python.toString());
        System.out.println(python.toEat());
        System.out.println(python.toRun());
        System.out.println(python.toSleep());
        System.out.println(python.toSpeak());
    }
}
