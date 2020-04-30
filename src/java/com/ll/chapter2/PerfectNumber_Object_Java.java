package com.ll.chapter2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PerfectNumber_Object_Java {

    //内部状态，存放待分类的目标数字
    private int _number;
    //内部缓存，防止重复进行不必要的求和运算
    private Map<Integer, Integer> _cache;

    public PerfectNumber_Object_Java(int targetNumber){
        _number = targetNumber;
        _cache = new HashMap<>();
    }

    public boolean isFactor(int potential){
        return _number % potential == 0;
    }

    public Set<Integer> getFactors(){
        Set<Integer> factors = new HashSet<>();
        factors.add(1);
        factors.add(_number);
        for (int i = 2; i < _number; i ++){
            if (isFactor(i)){
                factors.add(i);
            }
        }

        return factors;
    }

    //计算 “ 真约数和 ” ，即正约数之和减去数字本身
    public int aliquotSum(){
        if (_cache.get(_number) == null){
            int sum = 0;
            for (int i : getFactors()){
                sum += i;
            }
            _cache.put(_number, sum - _number);
        }
        return _cache.get(_number);
    }

    public boolean isPerfect(){
        return aliquotSum() == _number;
    }

    public boolean isAbundant(){
        return aliquotSum() > _number;
    }

    public boolean isDeficient(){
        return aliquotSum() < _number;
    }
}
