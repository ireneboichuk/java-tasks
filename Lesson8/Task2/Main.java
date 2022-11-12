package Lesson8.Task2;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Кіт", 2.5, 1);
        Dog dog1 = new Dog("Пес", 12, 5);
        Animal fish1 = new Fish("Рибка", 0.1, 1);
        Animal lion1 = new Lion("Лев", 55, 3);
        Animal pigeon1 = new Pigeon("Голуб", 0.5, 1);

        Animal animals[] = {cat1, dog1, fish1, lion1, pigeon1 };
        Arrays.sort(animals);
        for (Animal animal : animals) {
            System.out.println(animal.toIntroduce());
        }
        System.out.println(" \n ");

        System.out.println(cat1.toIntroduce());
        System.out.println(cat1.toEat());
        System.out.println(cat1.toMove());
        System.out.println(cat1.toSpeak());

        System.out.println(dog1.toIntroduce());
        System.out.println(dog1.toEat());
        System.out.println(dog1.toMove());
        System.out.println(dog1.toSpeak());

        System.out.println(fish1.toIntroduce());
        System.out.println(fish1.toEat());
        System.out.println(fish1.toMove());
        System.out.println(fish1.toSpeak());

        System.out.println(lion1.toIntroduce());
        System.out.println(lion1.toEat());
        System.out.println(lion1.toMove());
        System.out.println(lion1.toSpeak());

        System.out.println(pigeon1.toIntroduce());
        System.out.println(pigeon1.toEat());
        System.out.println(pigeon1.toMove());
        System.out.println(pigeon1.toSpeak());
    }
}
