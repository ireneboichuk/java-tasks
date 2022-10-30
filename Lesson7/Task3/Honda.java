package Lesson7.Task3;

import Lesson7.Task3.Car;
import Lesson7.Task3.CarEngine;

public class Honda extends Car {
    private String model;
    private CarEngine engine;
    private int yearOfProduction;

    public Honda(String model, int yearOfProduction, CarEngine engine) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engine = engine;
    }

    public void toStart() {
        System.out.println("Машина заводиться і рушає");
    }
    public void toStop() {
        System.out.println("Машина зупиняється");
    }

    @Override
    public String ToString() {
        return ("Машина: " + this.model + ". " + this.yearOfProduction + " року випуску. " + "Максимальна швидкість: "
                + this.engine.maxSpeed());
    }

}
