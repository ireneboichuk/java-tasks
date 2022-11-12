package Lesson8.Task2;

public class Cat extends Animal implements AdditionalPossibilities{
    private String name;
    private double weight;
    private int age;

    public Cat(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public String toEat() {
        return "Дайте мені мишу! Я хочу їсти";
    }

    @Override
    public String toMove() {
        return "Тигидик-тигидик!";
    }

    @Override
    public String toSpeak() {
        return "Няв-няв!";
    }

    @Override
    public boolean isSubjectToTraining() {
        return false;
    }

    public boolean hasWings() {
        return false;
    }
}
