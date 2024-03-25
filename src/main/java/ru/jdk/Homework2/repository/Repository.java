package ru.jdk.Homework2.repository;

public interface Repository<T> {
    void save(T text);
    T load();
}
