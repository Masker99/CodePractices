package com.rookie.basics;

import java.util.Arrays;
import java.util.Random;

public class PrintArrayAfterBubbleSort {
    Random random = new Random();

    public void assignmentForArray(int[] arr){
        int length = arr.length;
        for(int i = 0; i < length ; i++){
            arr[i] = this.random.nextInt(10);
        }
    }

    public void bubbleSort(int[] arr){
        int temp = 0;
        int length = arr.length;
        for(int i = 0 ; i < length ; i++){
            for(int j = 0 ; j < length - i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    temp = 0;
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        PrintArrayAfterBubbleSort printArrayAfterBubbleSort = new PrintArrayAfterBubbleSort();
        int[] arr = new int[10];
        printArrayAfterBubbleSort.assignmentForArray(arr);
        System.out.println(Arrays.toString(arr));
        printArrayAfterBubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
