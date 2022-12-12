package Lesson11;

import java.io.IOException;

public class B extends A{
    private int value1;
    private int value2;

    public B(int value1, int value2) {
        super(value1, value2);
    }

    @Override
    public String divisionOperation(int value1, int value2) throws IOException {
        if (value2 == 0) {
            throw new IOException("Ділити на нуль не можна!");
        } else {
            return String.format("%.2f", (double) (value1 / value2));
        }
    }
}
