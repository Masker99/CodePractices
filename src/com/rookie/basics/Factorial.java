package com.rookie.basics;

/**
 * 编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5。
 */
public class Factorial {
    public int getProduct(int n){
        return factorial(n);
    }

    public int factorial(int n){
        if(n == 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args){
        Factorial factorial = new Factorial();
        System.out.println(factorial.getProduct(5));
    }
}
