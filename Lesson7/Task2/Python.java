package Lesson7.Task2;

public class Python extends Animal{
    private String name;
    private int age;

    public Python(String name, int age) {
        super(name, age);
    }

    @Override
    public String toRun() {
        return "Я повзу не дуже швидко";
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
        return "Я нічого не кажу, як і миша";
    }
}
