package com.ll.chapter2;

import java.util.*;

//稍微向函数式靠拢的完美数分类实现
//众多方法都必须加上number参数，因为没有可以存放它的内部状态
//所有方法都带public static修饰，因为他们都是纯函数，并因此可以在完美数分类之外 的领域使用
//注意例子中对参数类型的选取，尽可能宽泛的参数类型可以增加函数重用的机会
//例子目前在重复执行分类操作的时候效率较低，因为没有缓存
public class PerfectNumberClassifier_Object_Java {

    public static boolean isFactor(final int candidate, final int number){
        return number % candidate == 0;
    }

    public static Set<Integer> factors(final int number){
        Set<Integer> factors = new HashSet<>();
        factors.add(1);
        factors.add(number);
        for (int i = 2; i < number; i ++){
            if (isFactor(i, number)){
                factors.add(i);
            }
        }
        return factors;
    }

    public static int aliquotSum(final Collection<Integer> fators){
        int sum = 0;
        int targetNumber = Collections.max(fators);
        for (Integer i : fators){
            sum += i;
        }

        return sum - targetNumber;
    }

    public static boolean isPerfect(final int number){
        return aliquotSum(factors(number)) == number;
    }

    public static boolean isAbundantt(final int number){
        return aliquotSum(factors(number)) > number;
    }

    public static boolean isDef(final int number){
        return aliquotSum(factors(number)) < number;
    }
}
