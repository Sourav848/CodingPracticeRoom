package com.sourav.java.examples.thread;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PollingExample {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public void startPolling() {
        scheduler.scheduleAtFixedRate(this::pollTask, 0, 5, TimeUnit.SECONDS);
    }

    public void stopPolling() {
        scheduler.shutdown();
        try {
            if (!scheduler.awaitTermination(5, TimeUnit.SECONDS)) {
                scheduler.shutdownNow();
            }
        } catch (InterruptedException e) {
            scheduler.shutdownNow();
            Thread.currentThread().interrupt();
        } finally {
        	 System.out.println("Polling task stopped at: " + LocalTime.now());
        }
    }

    private void pollTask() {
        // Your polling task logic goes here
        System.out.println("Polling task executed at: " + LocalTime.now());
    }

    public static void main(String[] args) {
        PollingExample pollingExample = new PollingExample();
        pollingExample.startPolling();

        // Sleep for some time to simulate the application running
        try {
            Thread.sleep(20000); // Simulate 20 seconds of execution
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Stop polling after some time
        pollingExample.stopPolling();
    }
}

