package Lesson7.Task2;

public class Horse extends Animal{
    private String name;
    private int age;

    public Horse(String name, int age) {
        super(name, age);
    }

    @Override
    public String toRun() {
        return "Я біжу швидко, як кінь!";
    }

    @Override
    public String toEat() {
        return  "Я їм багато свіжої трави";
    }

    @Override
    public String toSleep() {
        return "Я сплю мало";
    }

    @Override
    public String toSpeak() {
        return "Я кажу - І-ГО-ГО!";
    }
}
