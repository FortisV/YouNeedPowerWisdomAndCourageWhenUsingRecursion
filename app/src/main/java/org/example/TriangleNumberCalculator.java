package org.example;

import java.util.ArrayList;

public class TriangleNumberCalculator {
    int value(int n) {
        if(n <= 1) {
            return 1;
        }
        return n + value(n - 1);
    }
    int add(int n, int m) {
        return value(n) + value(m);
    }
    int subtract(int n, int m) {
        return value(n) - value(m);
    }
    int multiply(int n, int m) {
        return value(n) * value(m);
    }
    double divide(int n, int m) {
        return (double) value(n) / value(m);
    }
    ArrayList<Integer> sequence(int n) {
        ArrayList<Integer> list;
        if(n <= 1) {
            list = new ArrayList<>();
            list.add(value(n));
            return list;
        }
        list = sequence(n - 1);
        list.add(value(n));
        return list;
    }
}
