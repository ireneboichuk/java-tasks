package Lesson6.Task4;

public class Point {
    private int x;
    private int y;
    private static final String printAddValues1 = "Введіть значення X та Y (цілі числа) для першого об'єкта:";
    private static final String printAddValues2 = "Введіть значення X та Y (цілі числа) для другого об'єкта:";

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void print1 () {
        System.out.println(printAddValues1);
    }
    public static void print2 () {
        System.out.println(printAddValues2);
    }

    public String determineDistance (Point point) {
        double distance = Math.sqrt(Math.pow((point.x - this.x), 2) + Math.pow((point.y - this.y), 2));
        return "Відстань до іншого об'єкта: " + String.format("%.2f", distance);
    }
}
