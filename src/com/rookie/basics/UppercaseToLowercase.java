package com.rookie.basics;

/**
 *4、给定一个任意的大写字母A~Z，转换为小写字母。 （知识点：变量和运算符）
 */
public class UppercaseToLowercase {
    public char UpperCaseToLowercase(char source){
        return (char)(source+32);
    }

    public static void main(String[] args){
        UppercaseToLowercase uppercaseToLowercase = new UppercaseToLowercase();
        System.out.println(uppercaseToLowercase.UpperCaseToLowercase('A'));
    }
}
