package Lesson7.Task3;

import Lesson7.Task3.CarEngine;
import Lesson7.Task3.Honda;

public class Main {
    public static void main(String[] args) {
        CarEngine hondaEngine = new CarEngine(2.0);
        Honda hondaCar = new Honda("Honda Hornet", 2020, hondaEngine);
        System.out.println(hondaCar.ToString());
        hondaCar.toStart();
        hondaCar.toStop();

        CarEngine mercedesEngine = new CarEngine(2.5);
        Mercedes mercedesCar = new Mercedes("Mercedes-Benz C-class", 2018, mercedesEngine);
        System.out.println(mercedesCar.ToString());
        mercedesCar.toStart();
        mercedesCar.toStop();
    }
}
