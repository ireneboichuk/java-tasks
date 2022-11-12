package Lesson8.Task2;

public class Dog extends Animal implements AdditionalPossibilities{
    private String name;
    private double weight;
    private int age;

    public Dog(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public String toEat() {
        return "Дайте мені м'яса! Я голодний";
    }

    @Override
    public String toMove() {
        return "Я бігаю на чотирьох лапах";
    }

    @Override
    public String toSpeak() {
        return "Гав-гав!";
    }

    @Override
    public boolean isSubjectToTraining() {
        return true;
    }

    public boolean hasWings() {
        return false;
    }
}
