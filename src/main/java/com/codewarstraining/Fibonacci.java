package com.codewarstraining;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 11;
        for (int i = 1; i <= n; i++) {
            System.out.print(nonRecursivelyFib(i) + " ");
        }
    }

    public static int recursivelyFib(int i) {
        if (i == 1) return 1;
        if (i == 2) return 1;
        return recursivelyFib(i - 1) + recursivelyFib(i - 2);
    }

    public static int nonRecursivelyFib(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;

        int value0 = 0;
        int value1 = 1;
        int result = 1;

        for (int i = 0; i < n - 1; i++) {
            result = value0 + value1;
            value0 = value1;
            value1 = result;
        }

        return result;
    }
}
