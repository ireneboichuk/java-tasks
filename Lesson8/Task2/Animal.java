package Lesson8.Task2;

public abstract class Animal implements Comparable<Animal> {
    private String name;
    private double weight;
    private int age;

    public Animal(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public abstract String toMove();
    public abstract String toEat();
    public abstract String toSpeak();

    @Override
    public int compareTo(Animal a) {
        if (Integer.compare(this.age, a.age) != 0) {
            return (Integer.compare(this.age, a.age));
        } else {
            return Double.compare(this.weight, a.weight);
        }
    }

    public String toIntroduce() {
        return "Мене звуть " + this.name + ". Мені " + this.age + " років. " + "Моя вага: " + this.weight + " кг" ;
    }
}
