package com.sourav.java.examples;

 enum TrafficLight {
    RED(25),
    YELLOW(5),
    GREEN(100);

    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        TrafficLight signal = TrafficLight.RED; // Enum type variable declaration
        System.out.println("Current light: " + signal); // Enum constant usage
        System.out.println("Duration: " + signal.getDuration() + " seconds"); // Method call on enum constant

        switch (signal) {
            case RED:
                System.out.println("Stop!");
                break;
            case YELLOW:
                System.out.println("Prepare to stop.");
                break;
            case GREEN:
                System.out.println("Go!");
                break;
        }
    }
}
