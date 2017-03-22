package com.codewarstraining;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrei.tihomirov on 27.02.2017.
 */
public class Collections {

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("one");
        strs.add("two");
        strs.add("three");

        strs.remove("two");

        System.out.println(strs);
    }
}
