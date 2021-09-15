package com.rookie.basics;

import java.util.Scanner;

public class SumOfPrice {
    public static void main(String[] args){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < 5 ; i++){
            sum += input.nextInt();
        }

        System.out.println(sum/5);
    }
}
