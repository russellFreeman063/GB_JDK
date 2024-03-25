package ru.jdk.Homework3;

import java.util.Arrays;

public class Calculator {

    public static <T extends Number> double sum(T x, T y) {
        return x.doubleValue() + y.doubleValue();
    }

    public static <T extends Number> double multiply(T x, T y) {
        return x.doubleValue() * y.doubleValue();
    }

    public static <T extends Number> double divide(T x, T y) {
        if (y.doubleValue() == 0) {
            throw new IllegalArgumentException("Деление на ноль");
        }
        return x.doubleValue() / y.doubleValue();
    }

    public static <T extends Number> double subtract(T x, T y) {
        return x.doubleValue() - y.doubleValue();
    }

}
