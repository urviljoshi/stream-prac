package org.example;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
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

        //boxed stream class ops
        System.out.println(IntStream.range(0, 100).boxed().collect(Collectors.summingInt(x->x)));
        System.out.println(IntStream.range(0, 100).boxed().collect(Collectors.averagingInt(x->x)));
        System.out.println(IntStream.range(0, 100).boxed().collect(Collectors.minBy(Comparator.comparing(x->x))));
        System.out.println(IntStream.range(0, 100).boxed().collect(Collectors.maxBy(Comparator.comparing(x->x))));
        System.out.println(IntStream.range(0, 100).boxed().collect(Collectors.counting()));

        IntSummaryStatistics intSummaryStatistics1 = IntStream.range(0, 100).boxed().collect(Collectors.summarizingInt(x->x));
        System.out.println(intSummaryStatistics1.getSum());
        System.out.println(intSummaryStatistics1.getAverage());
        System.out.println(intSummaryStatistics1.getMin());
        System.out.println(intSummaryStatistics1.getMax());
        System.out.println(intSummaryStatistics1.getCount());

        IntSummaryStatistics  intSummaryStatistics =IntStream.range(0, 100     ).summaryStatistics();
        System.out.println(intSummaryStatistics.getSum());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getCount());


    }
}
