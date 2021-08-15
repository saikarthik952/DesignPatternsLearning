package org.example.main;

import org.example.RunnableTemplate;
import org.example.main.singleton.SingletonPattern;

import java.util.Arrays;
import java.util.concurrent.*;

public class RunApplication {
    public static void main(String args[]) throws InterruptedException {
        runnables();
    }
    private static void runnables() throws InterruptedException {
        Runnable runnable = () -> {
            SingletonPattern singletonPattern = SingletonPattern.getInstance();
            System.out.println(singletonPattern.toString());
        };
        ExecutorService scheduler = Executors.newFixedThreadPool(100);
        scheduler.invokeAll(Arrays.asList( Executors.callable(runnable),Executors.callable(runnable),Executors.callable(runnable) ));
        scheduler.shutdown();
    }
}
