package Lesson7.Task2;

public class Lion extends Animal{
    private String name;
    private int age;

    public Lion(String name, int age) {
        super(name, age);
    }
    @Override
    public String toRun() {
        return "Я біжу швидко, як лев!";
    }

    @Override
    public String toEat() {
        return  "Я їм багато свіжого м'яса";
    }

    @Override
    public String toSleep() {
        return "Я сплю мало";
    }

    @Override
    public String toSpeak() {
        return "Я кажу - Грррр!";
    }
}
