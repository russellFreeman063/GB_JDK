package ru.jdk.Homework5;

public class Main {

    public static void main(String[] args) {
        Philosopher[] philosophers = new Philosopher[5];
        Fork[] forks = new Fork[5];

        for (int i = 0; i < 5; i++) {
            forks[i] = new Fork(i + 1);
        }

        for (int i = 0; i < 5; i++) {
            philosophers[i] = new Philosopher("Философ " + (i + 1), forks[i], forks[(i + 1) % 5]);
            philosophers[i].start();
        }
    }

}

