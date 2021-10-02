package com.rookie.basics.designMode;

public class Student extends Person{
    public void say(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        new  Student().say("123");
    }
}
