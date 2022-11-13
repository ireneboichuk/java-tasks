package Lesson7.Task3;

public class Mercedes extends Car{
    private String model;
    private CarEngine engine;
    private int yearOfProduction;

    public Mercedes(String model, int yearOfProduction, CarEngine engine) {
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
