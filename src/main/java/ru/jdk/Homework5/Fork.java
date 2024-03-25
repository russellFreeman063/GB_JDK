package ru.jdk.Homework5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Fork {
    private final Lock lock;

    private final int id;
    public Fork(int id) {
        this.id = id;
        lock = new ReentrantLock();
    }

    public int getId() {
        return id;
    }


    public void pickUp() {
        lock.lock();
    }

    public void putDown() {
        lock.unlock();
    }
}
