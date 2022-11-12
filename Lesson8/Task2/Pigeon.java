package Lesson8.Task2;

public class Pigeon extends Animal implements AdditionalPossibilities{
    private String name;
    private double weight;
    private int age;

    public Pigeon(String name, double weight, int age) {
        super(name, weight, age);
    }

    public boolean hasWings() {
        return true;
    }

    @Override
    public String toEat() {
        return "Дайте мені хліба!";
    }

    @Override
    public String toMove() {
        return "Я літаю";
    }

    @Override
    public String toSpeak() {
        return "Гурррр-гурррр-гурррр";
    }

    @Override
    public boolean isSubjectToTraining() {
        return false;
    }
}
