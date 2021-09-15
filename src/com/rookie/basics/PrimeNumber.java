package com.rookie.basics;

/**
 * 编写一个方法，输出大于200的最小的质数
 */
public class PrimeNumber {
    public int getPrimeNumberFromOneNumber(int number){
        int n = number+1;
        while(true){
            if(isPrimeNumber(n)){
                return n;
            }
            n++;
        }
    }

    public boolean isPrimeNumber(int number){
        for(int i = 2 ; i <= number - 1 ; i++){
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println(primeNumber.getPrimeNumberFromOneNumber(200));
    }
}
