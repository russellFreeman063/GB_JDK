package ru.jdk.Homework3;

import java.util.Arrays;

public class Main {

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {

        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};

        System.out.println(Calculator.sum(10, 10));
        System.out.println(compareArrays(array1, array2));

    }

}
