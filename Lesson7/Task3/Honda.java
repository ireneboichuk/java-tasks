package Lesson7.Task3;

import Lesson7.Task3.Car;
import Lesson7.Task3.CarEngine;

public class Honda extends Car {
    private String model;
    private CarEngine engine;
    private int yearOfProduction;

    public Honda(String model, int yearOfProduction, CarEngine engine) {
        super(model, yearOfProduction, engine);
    }

    @Override
    public void toStart() {
        System.out.println("Машина " + this.model + " заводиться і рушає");
    }

    @Override
    public void toStop() {
        System.out.println("Машина " + this.model + " зупиняється");
    }

    public String ToString() {
        return ("Машина: " + this.model + ". " + this.yearOfProduction + " року випуску. " + "Максимальна швидкість: "
                + this.engine.maxSpeed());
    }
}
