package com.codewarstraining;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by andrei.tihomirov on 14.03.2017.
 */
public class PhoneNumber {

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        return new StringBuffer(
                Arrays.stream(numbers)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining(""))
        ).insert(0, "(").insert(4, ") ").insert(9, "-").toString();
    }

}
