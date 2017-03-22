package com.codewarstraining;

/**
 * Created by andrei.tihomirov on 20.03.2017.
 */
public class Scramblies {

    public static void main(String[] args) {
        System.out.println(Scramblies.scramble("cedewaraaossoqqyt", "codewars"));
        System.out.println(Scramblies.scrambleBest("cedewaraaossoqqyt", "codewars"));
    }

    public static boolean scramble(String str1, String str2) {
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        boolean isSymbolDetected;
        for (int i = 0; i < array2.length; i++) {
            isSymbolDetected = false;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    array1[j] = Character.MIN_VALUE;
                    isSymbolDetected = true;
                    break;
                }
            }
            if (!isSymbolDetected) {
                return false;
            }
        }
        return true;
    }

    public static boolean scrambleBest(String str1, String str2) {
        if (str2.length() > str1.length()) return false;
        for (String s : str2.split("")) {
            if (!str1.contains(s)) return false;
            str1 = str1.replaceFirst(s, "");
        }

        return true;
    }
}
