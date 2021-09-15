package com.rookie.basics;

/**
 * 猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个，
 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 * 以后每天早上都吃了前一天剩下的一半零一个。
 * 到第10天早上想再吃时，见只剩下一个桃子了。
 * 求第一天共摘了多少。
 */
public class MonkeyEatPeach {
    public int theNumberOfPeach(int earlyDay,int afterDay,int numberOfPeaches){
        int days = afterDay - earlyDay;

        int sum = 1;

        while(days > 0){
            sum = 2*(sum+1);
            days--;
        }
        return sum;
    }

    public static void main(String[] args){
        MonkeyEatPeach monkeyEatPeach = new MonkeyEatPeach();
        System.out.println(monkeyEatPeach.theNumberOfPeach(1,10,1));
    }
}
