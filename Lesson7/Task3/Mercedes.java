package Lesson7.Task3;

public class Mercedes extends Car{
    private String model;
    private CarEngine engine;
    private int yearOfProduction;

    public Mercedes(String model, int yearOfProduction, CarEngine engine) {
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
