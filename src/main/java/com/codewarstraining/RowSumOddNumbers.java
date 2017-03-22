package com.codewarstraining;

/**
 * Created by andrei.tihomirov on 14.03.2017.
 */
public class RowSumOddNumbers {

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers0(42));
    }

    public static int rowSumOddNumbers(int n) {
        int start = (n * n) - (n - 1);
        int end = start + ((n * 2) - 1);
        int sum = 0;

        for(int i = start; i < end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static int rowSumOddNumbers0(int n) {
        return n * n * n;
    }

}
