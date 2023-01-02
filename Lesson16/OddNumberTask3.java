package Lesson16;

public class OddNumberTask3 extends Thread{
    private String name;

    public OddNumberTask3(String name) {
        super(name);
    }

    @Override
    public void run () {
        this.getOddNumbers();
    }

    private synchronized void getOddNumbers() {
        for (int i = 1; i < 10; i += 2) {
            System.out.println(this.getName() + ": " + i);
        }
        notify();
    }
}
