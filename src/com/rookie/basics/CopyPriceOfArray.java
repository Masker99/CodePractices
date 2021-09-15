package com.rookie.basics;

/**
 * 将一个字符数组的值（neusofteducation）拷贝到另一个字符数组中
 */
public class CopyPriceOfArray {
    public char[] copyFrom(char[] arr){
        char[] temp = new char[arr.length];
        int i=0;
        for(char item : arr){
            temp[i++] = item;
        }

        return temp;
    }
}
