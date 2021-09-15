package com.rookie.basics;

/**
 * 3、输入一个数字，判断是一个奇数还是偶数
 */
public class OddAndEvenNumber {
    public boolean isOddNumber(int number){
        if(number % 2 == 0){
            return true;
        }

        return false;
    }
}
