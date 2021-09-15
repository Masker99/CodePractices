package com.rookie.basics;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机产生一个10以内的正整数，用户循环输入三个整数，如果用户输入的整数包含随机数，输出“猜对了”；反之，输出“没猜到”。
 * 例如：
 * 随机数为4，用户输入数为：2,3,4。输出：猜对了
 * 随机数为4，用户输入数为：1,2,3。输出：没猜到随机产生一个10以内的正整数，用户循环输入三个整数，如果用户输入的整数包含随机数，输出“猜对了”；反之，输出“没猜到”。
 * 例如：
 * 随机数为4，用户输入数为：2,3,4。输出：猜对了
 * 随机数为4，用户输入数为：1,2,3。输出：没猜到
 */
public class GuessNumber {
    public int getRandomNumber(){
        int randomNumber = new Random().nextInt(10)+1;

        return randomNumber;
    }

    public boolean ifExits(int[] arr,int randomNumber){
        System.out.println("随机数："+randomNumber);
        for (int temp : arr){
            if(temp == randomNumber){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[3];

        int i = 0;
        while(i<3){
            arr[i] = input.nextInt();
            i++;
        }

        GuessNumber guessNumber = new GuessNumber();
        if (guessNumber.ifExits(arr,guessNumber.getRandomNumber())){
            System.out.println("存在");
        }else{
            System.out.println("不存在");
        }
    }
}
