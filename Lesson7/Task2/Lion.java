package Lesson7.Task2;

public class Lion extends Animal{
    private String name;
    private int age;

    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toRun() {
        return "Я біжу швидко, як лев!";
    }

    public String toEat() {
        return  "Я їм багато свіжого м'яса";
    }

    public String toSleep() {
        return "Я сплю мало";
    }

    public String toSpeak() {
        return "Я кажу - Грррр!";
    }

    @Override
    public String toString() {
        return "Мене звуть " + this.name + ". Мені " + this.age + " років";
    }
}
