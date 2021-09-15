package com.rookie.basics;

/**
 * 1、企业发放的奖金根据利润提成。利润低于或等于10万元时，奖金可提10%；
 *   利润高于10万元，低于或等于20万元时，高于10万元的部分，可提成7.5%；
 *   高于20万，低于或等于40万时，高于20万元的部分，可提成5%；
 *   高于40万，低于或等于60万时，高于40万元的部分，可提成3%；
 *   高于60万，低于或等于100万时，高于60万元的部分，可提成1.5%，
 *   高于100万元时，超过100万元的部分按1%提成，
 *   输入一个整数变量为当月利润，求应发放奖金总数？（知识点：条件语句） [必做题]
 */
public class Bonus {

    public double getBonus(int monthlyProfit){
        double bonus = 0;

        if(monthlyProfit <= 10 )
            bonus = 0.1*monthlyProfit;
        if(monthlyProfit > 10 && monthlyProfit <= 20)
            bonus = (monthlyProfit-10)*0.75 + 0.1*monthlyProfit;

        return bonus;
    }
    public static void main(String[] args){

    }
}
