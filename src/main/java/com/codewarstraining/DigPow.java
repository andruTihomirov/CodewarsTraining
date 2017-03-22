package com.codewarstraining;

/**
 * Created by andrei.tihomirov on 20.03.2017.
 */
public class DigPow {

    public static void main(String[] args) {
        System.out.println(digPow(89, 1));
    }

    public static long digPow(int n, int p) {
        long[] digits;
        long sum = 0;
        while (n != 0) {
            sum = sum + (n % 10);
            n /= 10;
        }
        return sum;
    }
}
