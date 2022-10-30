package Lesson7.Task2;

public class Python extends Animal{
    private String name;
    private int age;

    public Python(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toRun() {
        return "Я повзу не дуже швидко";
    }

    public String toEat() {
        return  "Я їм багато свіжого м'яса";
    }

    public String toSleep() {
        return "Я сплю мало";
    }

    public String toSpeak() {
        return "Я нічого не кажу, як і миша";
    }

    @Override
    public String toString() {
        return "Мене звуть " + this.name + ". Мені " + this.age + " років";
    }
}
