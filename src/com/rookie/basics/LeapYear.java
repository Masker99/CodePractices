package com.rookie.basics;


/**
 * 编写一个方法，判断该年份是平年还是闰年。
 */
public class LeapYear {
    public boolean isLeapYear(int year){
        if(year % 400 == 0){
            return true;
        }else if(year % 4 == 0 && year % 100 != 0){
            return true;
        }

        return false;
    }
}
