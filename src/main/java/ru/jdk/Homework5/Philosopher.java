package ru.jdk.Homework5;


public class Philosopher extends Thread {

    private String name;
    private Fork leftFork;
    private Fork rightFork;
    private int mealsEaten = 0;

    public Philosopher(String name, Fork leftFork, Fork rightFork) {
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            think();
            eat();
        }
    }

    private void think() {
        System.out.println(name + " размышляет.");
        try {
            Thread.sleep((long) (Math.random() * 2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void eat() {
        leftFork.pickUp();
        System.out.println(name + " взял вилку " + leftFork.getId()+ " слева.");
        rightFork.pickUp();
        System.out.println(name + " взял вилку " + rightFork.getId() + " справа.");
        mealsEaten++;
        System.out.println(name + " ест.");
        leftFork.putDown();
        System.out.println(name + " положил вилку " + leftFork.getId()+ " слева.");
        rightFork.putDown();
        System.out.println(name + " положил вилку " + rightFork.getId() + " справа.");
        if (mealsEaten == 3) {
            System.out.println(name + " наелся");
        }
    }

}

