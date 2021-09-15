package com.rookie.basics;

/**
 * 将一个数组中的重复元素保留一个其他的清零
 */
public class RemovingDuplicateElements {
    public int[] removeDuplicate(int[] arr){
        int length = arr.length;
        int temp = 0;
        for(int i = 0 ; i < length ; i++){
            temp = arr[i];
            for(int j= i ; j < length ; j++){
                if(arr[j] == temp ){
                    arr[j] = 0;
                }
            }
        }

        return arr;
    }
}
