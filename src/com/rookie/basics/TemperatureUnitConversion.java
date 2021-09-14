package com.rookie.basics;

import java.math.BigDecimal;

/**
 * 3、华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。[选做题]
 */
public class TemperatureUnitConversion {
    public boolean ifFahrenheit(String degree){
        return (degree.endsWith("F") || degree.endsWith("f"));
    }

    public double FahrenheitToCentigrade(String degree){
        int source = Integer.parseInt(degree.substring(0,(degree.length() - 2)));
        return (source-32)*5/9;
    }

    public double CentigradeToFahrenheit(String degree){
        int source = Integer.parseInt(degree.substring(0,(degree.length() - 2)));
        return source*9/5+32;
    }

    public static void main(String[] args){
        TemperatureUnitConversion temperatureUnitConversion = new TemperatureUnitConversion();
        String degree = "11F";
        if(temperatureUnitConversion.ifFahrenheit(degree)){
            System.out.println(temperatureUnitConversion.FahrenheitToCentigrade(degree)+"C");
        }else{
            System.out.println(temperatureUnitConversion.CentigradeToFahrenheit(degree)+"F");
        }

    }
}
