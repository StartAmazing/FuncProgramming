package com.ll.chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TheCompanyProcess_Functional_Java {
    public static String cleanNames(List<String> names){
        if (names == null) return "";
        return names
                .parallelStream()
                .filter(name -> name != null && name.length() > 1)
                .map(name -> capitalize(name))
                .collect(Collectors.joining(","));
    }

    private static String capitalize(String e){
        return e.substring(0, 1).toUpperCase() + e.substring(1);
    }

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("alice");
        data.add("b");
        System.out.println(cleanNames(data));
    }
}
