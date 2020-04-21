package task28;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 4; i++) {
            Callable callable = new MyCallable();
            Future<String> future = executor.submit(callable);
            System.out.println(future.get());
        }
        executor.shutdown();
    }
    public static class MyCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
            return "easy-peasy, lemon squeezy";
        }
    }
}

