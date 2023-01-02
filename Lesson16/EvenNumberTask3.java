package Lesson16;

public class EvenNumberTask3 extends Thread{
    private String name;

    public EvenNumberTask3(String name) {
        super(name);
    }

    @Override
    public void run () {
        this.getEvenNumbers();
    }

    private synchronized void getEvenNumbers() {
        for (int i = 0; i < 10; i+=2) {
            System.out.println(this.getName() + ": " + i);
        }
        notify();
    }
}
