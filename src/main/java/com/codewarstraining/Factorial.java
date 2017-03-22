package com.codewarstraining;

import java.math.BigInteger;

/**
 * Created by andrei.tihomirov on 21.02.2017.
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.print(withBigIntegerFactorial(3));
    }

    public static int recursivelyFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * recursivelyFactorial(n - 1);
    }

    public static int nonRecursivelyFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static BigInteger withBigIntegerFactorial(int n) {
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) {
            ret = ret.multiply(BigInteger.valueOf(i));
        }
        return ret;
    }

}
