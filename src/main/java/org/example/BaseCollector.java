package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseCollector {
    public static void main(String[] args) {
        Character[] ch = { 'G', 'e', 'e', 'k', 's', 'f', 'o',
                'r', 'G', 'e', 'e', 'k', 's' };

        System.out.println(Arrays.stream(ch).map(String::valueOf).collect(Collectors.joining()));
         System.out.println(Arrays.stream(ch).map(String::valueOf).collect(Collectors.joining(":: ")));
        System.out.println(Arrays.stream(ch).map(String::valueOf).collect(Collectors.joining(",","urvil","joshi")));
        System.out.println(Arrays.stream(ch).map(String::valueOf).collect(Collectors.mapping(x->x.concat("a"),Collectors.toList())));

    }
}
