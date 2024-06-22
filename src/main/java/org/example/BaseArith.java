package org.example;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BaseArith {
    public static void main(String[] args) {
        System.out.println(IntStream.range(0, 100).sum());
        System.out.println(IntStream.range(0, 100).average());
        System.out.println(IntStream.range(0, 100).min());
        System.out.println(IntStream.range(0, 100).max());
        System.out.println(IntStream.range(0, 100).count());
        System.out.println(IntStream.range(0, 100).collect(Collectors.averagingInt(x->x)));
    }
}
