package task27;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            Counter.nextCounter();
        }
    }
}
