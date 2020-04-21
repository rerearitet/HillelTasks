package task27;

public class Counter {
    static int COUNTER = 0;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread thread = new MyThread(String.valueOf(i));
            thread.start();
            thread.join();
        }
        System.out.println(COUNTER);
    }

    public static void nextCounter() {
        COUNTER++;
    }
}
