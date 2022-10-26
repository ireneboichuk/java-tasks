package Lesson6.Task3;

public class Dog {
    private String name;
    private int age;
    private String dogBreed;
    private boolean hasOwner;

    public Dog(String name, int age, String dogBreed, boolean hasOwner) {
        this.name = name;
        this.age = age;
        this.dogBreed = dogBreed;
        this.hasOwner = hasOwner;
    }

    public String print() {
        if (this.hasOwner == true) {
            return (String) ("Ваш ідеальний собака: " + this.name + ", " + this.age + "роки(-ів), " + this.dogBreed + ", має власника");
        } else {
            return (String) ("Ваш ідеальний собака: " + this.name + ", " + this.age + "роки(-ів), " + this.dogBreed + ", не має власника");
        }
    }
}
