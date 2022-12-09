package Lesson11;

import java.io.IOException;

public class A {
    private int value1;
    private int value2;

    public A(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public String divisionOperation(int value1, int value2) throws IOException {
        if (value2 == 0) {
            throw new IOException("Ділити на нуль не можна!");
        } else {
            return String.format("%.2f", (double) (value1 / value2));
        }
    }
}
