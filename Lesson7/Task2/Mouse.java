package Lesson7.Task2;

public class Mouse extends Animal{
    private String name;
    private int age;

    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toRun() {
        return "Я біжу швидко, як мишка!";
    }

    public String toEat() {
        return  "Я їм багато свіжого зерна";
    }

    public String toSleep() {
        return "Я сплю мало";
    }

    public String toSpeak() {
        return "Я нічого не кажу :)";
    }

    @Override
    public String toString() {
        return "Мене звуть " + this.name + ". Мені " + this.age + " років";
    }
}
