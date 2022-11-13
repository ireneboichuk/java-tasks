package Lesson7.Task2;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String toSleep();
    public abstract String toEat();
    public abstract String toRun();

    public abstract String toSpeak();
    public String toString() {
        return "Мене звуть " + this.name + ". Мені " + this.age + " років";
    }
}
