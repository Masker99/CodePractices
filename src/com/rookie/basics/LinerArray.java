package com.rookie.basics;

/**
 * 编写一个简单程序，要求数组长度为5，分别赋值10，20，30，40，50，在控制台输出该数组的值。
 */
public class LinerArray {
    public int[] getLinerArray(int length){
        int[] arr = new int[length];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        return arr;
    }
}
