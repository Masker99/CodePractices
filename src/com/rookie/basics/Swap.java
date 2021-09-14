package com.rookie.basics;

/**
 * 1、已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序
 */
public class Swap {
    public int[] Swap(int[] arr){
        int temp = arr[0];
        arr[0]= arr[1];
        arr[1] = temp;

        return arr;
    }
}
