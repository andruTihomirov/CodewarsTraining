package com.codewarstraining;

/**
 * Created by andrei.tihomirov on 15.03.2017.
 */
public class PlayPass {

    public static final int RADIX = 10;
    public static final int COMPLEMENT = 9;
    public static final char CHAR_Z = 'z';
    public static final char CHAR_A = 'a';
    public static final char CHAR_0 = '0';
    public static final char CHAR_9 = '9';

    public static void main(String[] args) {
        String result = playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2);
        System.out.println(result);
    }

    public static String playPass(String s, int n) {
        char[] symbols = s.toLowerCase().toCharArray();
        symbols = shiftLetters(symbols, n);
        symbols = complementDigits(symbols, COMPLEMENT);
        symbols = doSerratedString(symbols);
        String result = reverseString(new String(symbols));
        return result;
    }

    private static char[] shiftLetters(char[] symbols, int shift) {
        int symbolPosition;
        for (int i = 0; i < symbols.length; i++) {
            if (isSymbol(symbols[i])) {
                symbolPosition = symbols[i] + shift;
                symbols[i] = (char) (symbolPosition > CHAR_Z ? (symbolPosition - CHAR_Z) + (CHAR_A - 1) : symbolPosition);
            }
        }
        return symbols;
    }

    private static char[] complementDigits(char[] symbols, final int complement) {
        for (int i = 0; i < symbols.length; i++) {
            if (isDigit(symbols[i]))  {
                symbols[i] = Character.forDigit(complement - Character.getNumericValue(symbols[i]), RADIX);
            }
        }
        return symbols;
    }

    private static char[] doSerratedString(char[] symbols) {
        for(int i = 0; i < symbols.length; i++) {
            if(i % 2 == 0) {
                symbols[i] = Character.toUpperCase(symbols[i]);
            }
        }
        return symbols;
    }

    private static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static boolean isSymbol(char symbol) {
        if (symbol >= CHAR_A && symbol <= CHAR_Z) {
            return true;
        }
        return false;
    }

    private static boolean isDigit(char symbol) {
        if (symbol >= CHAR_0 && symbol <= CHAR_9) {
            return true;
        }
        return false;
    }
}
