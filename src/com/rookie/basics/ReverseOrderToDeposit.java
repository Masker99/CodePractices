package com.rookie.basics;


/**
 * 将一个数组中的元素逆序存放
 */
public class ReverseOrderToDeposit {
    public int[] reverseOrder(int[] arr){
        int length = arr.length;
        int i = 0,j = length - 1;

        int temp = 0;
        while(i != j || i-j>0){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }
}
