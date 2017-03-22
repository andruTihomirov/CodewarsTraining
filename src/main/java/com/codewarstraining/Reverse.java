package com.codewarstraining;

/**
 * Created by andrei.tihomirov on 21.02.2017.
 */
public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
        char[] symbols = {'a', 'b', 'c'};
        reverseArray(symbols);
    }

    public static StringBuilder reverseString(String str) {
        return new StringBuilder(str).reverse();
    }

    public static void reverseArray(char[] symbols) {
        for (int i = symbols.length - 1; i >= 0; i--) {
            System.out.print(symbols[i]);
        }
    }
}
