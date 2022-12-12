package Lesson11;

public class C extends B{
    private int value1;
    private int value2;

    public C(int value1, int value2) {
        super(value1, value2);
    }

    @Override
    public String divisionOperation(int value1, int value2) {
        if (value2 == 0) {
            return "Ділити на нуль не можна!";
        } else {
            return String.format("%.2f", (double) (value1 / value2));
        }
    }
}
