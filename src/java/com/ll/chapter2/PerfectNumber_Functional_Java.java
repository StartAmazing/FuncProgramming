package com.ll.chapter2;

import java.util.stream.IntStream;

//完美数分类的Java8实现
public class PerfectNumber_Functional_Java {

    public static IntStream factorsOf(int number){
        return IntStream.range(1, number + 1)
                .filter(potential -> number % potential == 0);
    }

    public static int allquotSum(int number){
        return factorsOf(number).sum() - number;
    }

    public static boolean isPerfect(int number){
        return allquotSum(number) == number;
    }

    public static boolean isAundant(int number){
        return allquotSum(number) > number;
    }

    public static boolean isDeficient(int number){
        return allquotSum(number) < number;
    }


}
