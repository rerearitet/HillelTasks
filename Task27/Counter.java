package task27;

import java.util.ArrayList;

public class Counter {
    static int COUNTER = 0;

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new MyThread(String.valueOf(i));
            thread.start();
            threads.add(thread);
        }
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).join();
        }
        System.out.println(COUNTER);
    }

    public synchronized static void nextCounter() {
        COUNTER++;
    }
}
