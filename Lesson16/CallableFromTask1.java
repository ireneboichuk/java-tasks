package Lesson16;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableFromTask1 implements Callable<String> {
    private String name;

    public String getName() {
        return name;
    }

    public CallableFromTask1(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception{
        Random generator = new Random();
        Integer randomNumber = generator.nextInt(100);
        return (this.getName() + ": " + randomNumber);
    }
}
