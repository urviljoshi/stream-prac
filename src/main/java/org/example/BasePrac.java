package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BasePrac {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        System.out.println(names.stream().filter(x->x.contains("l")).toList());
        System.out.println(names.stream().map(String::toLowerCase).toList());
        // two param reduce
        System.out.println(names.stream().reduce("", (n1,n2)-> n1.concat(n2)));
        // three param reduce
        System.out.println(names.stream().reduce(0, (n1,n2)-> n1+n2.length(),Integer::sum));
        // sorting
        System.out.println(names.stream().sorted(Comparator.comparing(String::length)).toList());
        //distinct limit
        System.out.println(names.stream().distinct().toList());
        System.out.println(names.stream().limit(1).toList());

    }
}
