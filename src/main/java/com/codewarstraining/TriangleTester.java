package com.codewarstraining;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by andrei.tihomirov on 14.03.2017.
 */
public class TriangleTester {

    public static void main(String[] args) {
        System.out.println(isTriangle(7, 2, 2));
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a < 1 || b < 1 || c < 1) {
            return false;
        }

        List<Integer> triangleSides = Stream.of(a, b, c).collect(Collectors.toList());
        Integer max = triangleSides.stream().max(Integer::compare).get();
        triangleSides.remove(max);

        int sum = triangleSides.stream().mapToInt(Integer::intValue).sum();

        return sum > max ? true : false;
    }

}
