package com.codewarstraining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by andrei.tihomirov on 13.03.2017.
 */
public class XBonacci {

    public static void main(String[] args) {
        double[] array = tribonacci(new double []{1, 1}, 10);
        for (Double elem : array) {
            System.out.println(elem);
        }
    }

    public static double[] tribonacci(double[] s, int n) {
        if (n < 3) {
            return new double[0];
        }

        List<Double> elements = Arrays.stream(s).boxed().collect(Collectors.toList());
        prepareArray(elements);

        double first, second, third;

        for(int i = 2; i < (n - 1); i++) {
            first = elements.get(i - 2);
            second = elements.get(i - 1);
            third = elements.get(i);
            elements.add(first + second + third);
        }

        return elements.stream().mapToDouble(value -> value).toArray();
    }

    private static void prepareArray(List<Double> elements) {
        int i = 0;
        while (elements.size() < 3) {
            elements.add(i, 0.0);
            i++;
        }
    }
}
