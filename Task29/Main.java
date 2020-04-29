package task29;

public class Main {
    public static void main(String[] args) {
        JobQueue myJobQueue = new JobQueue();
        Thread thread = new Thread(() -> {
            try {
                while (true) myJobQueue.getJob().run();
            } catch (InterruptedException e) { }
        });
        thread.start();
        for (int i = 0; i < 10; i++) {
            int j = i;
            myJobQueue.put(() -> System.out.println(j));
        }
        thread.interrupt();
    }
}
