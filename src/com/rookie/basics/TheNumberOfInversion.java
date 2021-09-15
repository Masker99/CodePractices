package com.rookie.basics;

import java.util.Arrays;

/**
 * 由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321
 */
public class TheNumberOfInversion {
    public int[] inverse(int num){
        int temp = num;
        int[] arr = new int[4];
        int i = 0;
        do{
            arr[i] = temp%10;
            i++;
            temp /= 10;
        }while(temp > 0);

        return arr;
    }

    public static void main(String[] args){
        TheNumberOfInversion theNumberOfInversion = new TheNumberOfInversion();
        int[] arr = theNumberOfInversion.inverse(1234);
        System.out.print(Arrays.toString(arr));
    }
}
