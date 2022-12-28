package Lesson16;

public class ThreadFromTask2 extends Thread {
    private int waitMilliSeconds;
    private String name;

    public ThreadFromTask2(String name, int waitMilliSeconds) {
        super(name);
        this.waitMilliSeconds = waitMilliSeconds;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(waitMilliSeconds);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.getName() + ": " + i);
        }
    }
}
