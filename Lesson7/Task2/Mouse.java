package Lesson7.Task2;

public class Mouse extends Animal{
    private String name;
    private int age;

    public Mouse(String name, int age) {
        super(name, age);
    }

    @Override
    public String toRun() {
        return "Я біжу швидко, як мишка!";
    }

    @Override
    public String toEat() {
        return  "Я їм багато свіжого зерна";
    }

    @Override
    public String toSleep() {
        return "Я сплю мало";
    }

    @Override
    public String toSpeak() {
        return "Я нічого не кажу :)";
    }
}
