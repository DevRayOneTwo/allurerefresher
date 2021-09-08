package ru.devray.allurerefresher;

import java.util.Arrays;

public class IntCalculator {

    public int add(int i1, int i2){
        return i1 + i2;
    }

    public int add(int[] ints){
        return Arrays.stream(ints).sum();
    }

    public int multiply(int i1, int i2){
        return i1 * i2;
    }

    public int multiply(int[] ints){
        return Arrays.stream(ints).reduce((i1, i2) -> i1 * i2).getAsInt();
    }

    public int subtract(int i1, int i2){
        return i1 - i2;
    }

    public int divide(int i1, int i2){
        return (i2 == 0) ? 0 : i1 / i2;
    }
}
