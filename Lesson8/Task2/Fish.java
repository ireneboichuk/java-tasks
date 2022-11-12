package Lesson8.Task2;

public class Fish extends Animal implements AdditionalPossibilities{
    private String name;
    private double weight;
    private int age;

    public Fish(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public String toEat() {
        return "Дайте мені спеціального корму!";
    }

    @Override
    public String toMove() {
        return "Я плаваю";
    }

    @Override
    public String toSpeak() {
        return null;
    }

    @Override
    public boolean isSubjectToTraining() {
        return false;
    }

    public boolean hasWings() {
        return false;
    }
}
