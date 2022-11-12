package Lesson8.Task2;

public class Lion extends Animal implements AdditionalPossibilities {
    private String name = "Лев";
    private double weight;
    private int age;

    public Lion(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public String toEat() {
        return "Я хочу багато свіжого м'яса!";
    }

    @Override
    public String toMove() {
        return "Я підкрадаюсь непомітно";
    }

    @Override
    public String toSpeak() {
        return "Грррррр!";
    }

    @Override
    public boolean isSubjectToTraining() {
        return true;
    }

    public boolean hasWings() {
        return false;
    }
}
