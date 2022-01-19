package com.rookie.concurrent;

/**
 * 体验Thread 的 yidle方法
 * @author Masker
 * @date 2022-1-16
 */
public class TestYieldMethod implements Runnable{

    TestYieldMethod(){
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0 ; i < 5 ; i++){
            if ((i % 5) == 0){
                System.out.println(Thread.currentThread()+" yield cpu...");

                Thread.yield();
            }
        }

        System.out.println(Thread.currentThread()+" is over.");
    }

    public static void main(String[] args) {
        new TestYieldMethod();
        new TestYieldMethod();
        new TestYieldMethod();
    }
}
