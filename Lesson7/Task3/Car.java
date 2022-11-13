package Lesson7.Task3;

import Lesson7.Task3.CarEngine;

public abstract class Car {
    private String model;
    private CarEngine engine;
    private int yearOfProduction;

    public Car(String model, int yearOfProduction, CarEngine engine) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarEngine getEngine() {
        return engine;
    }

    public void setEngine(CarEngine engine) {
        this.engine = engine;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void toStart();
    public abstract void toStop();
}
