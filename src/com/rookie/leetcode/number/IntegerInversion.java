package com.rookie.leetcode.number;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] (31为次方)，就返回 0。

 */
public class IntegerInversion {
    public int reverse(int x) {
        int result = 0;

        while(x != 0){
            if(result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10 ){
                return 0;
            }
            int temp = x % 10;
            x = x / 10;
            result = result * 10 + temp;
        }

        return result;
    }
    public static void main(String[] args){
        IntegerInversion integerInversion = new IntegerInversion();
        System.out.print(integerInversion.reverse(321));
    }
}
