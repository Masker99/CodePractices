package com.rookie.basics;

/**
 * 2、给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12
 * 注：分解数字既可以先除后模也可以先模后除
 * 345 10 5
 */
public class TheSumOfTheDigits {
    public int TheSumOfTheDigits(int number){
        int result = 0;

        while(number!=0){
            result += number%10;  //取个位数
            number /= 10;         //消去个位数后
        }
        return result;
    }

    public static void main(String[] args){
        TheSumOfTheDigits theSumOfTheDigits = new TheSumOfTheDigits();
        System.out.println(theSumOfTheDigits.TheSumOfTheDigits(123456789));
    }
}
