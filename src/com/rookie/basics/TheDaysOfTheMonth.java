package com.rookie.basics;

/**
 * 如果月份month为1—12的一个月份，输出该月份的天数；如果数字不符合，输出“错误的月份”。
 * 1、3、5、7、8、10、12月天数为31
 * 2月天数为28
 * 4、6、9、11月天数为30
 */
public class TheDaysOfTheMonth {
    public void TheDaysOfTheMonth(int month){
        int days = 0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            case 2:
                System.out.println("28");
            default:
                System.out.println("错误的月份");
        }
    }
}
