package com.ll.chapter2;

import java.util.ArrayList;
import java.util.List;

public class TheCompanyProcess_Command_Java {

    public static String cleanNames(List<String> listOfNames) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < listOfNames.size(); i++) {
            if (listOfNames.get(i).length() > 1) {
                result.append(capitalizeString(listOfNames.get(i))).append(",");
            }
        }

        return result.substring(0, result.length() - 1);
    }

    public static String capitalizeString(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("neal");
        data.add("s");
        data.add("stu");
        data.add("j");
        data.add("rich");
        data.add("bob");
        data.add("aiden");
        data.add("j");
        data.add("ethan");
        data.add("liam");
        data.add("mason");
        data.add("noah");
        data.add("lucas");
        data.add("jacob");
        data.add("jayden");
        data.add("jack");

        String res = cleanNames(data);
        System.out.println(res);
    }
}
