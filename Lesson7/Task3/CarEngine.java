package Lesson7.Task3;

public class CarEngine{
    private double engine;
    private int maxSpeed;

    public CarEngine(double engine) {
        this.engine = engine;
    }

    public int maxSpeed() {
        if (engine <= 2.0) {
            return this.maxSpeed = 130;
        } else {
            return this.maxSpeed = 180;
        }
    }
}
