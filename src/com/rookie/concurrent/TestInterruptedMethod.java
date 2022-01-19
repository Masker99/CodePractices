package com.rookie.concurrent;

/**
 * 测试线程中断方法
 * @author Masker
 * @date 2022-1-16
 */
public class TestInterruptedMethod {
    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =  0 ; i < 50 ; i++){
                    System.out.println(Thread.currentThread()+" is running.");
                }
//                while (!Thread.currentThread().isInterrupted()){
//                    System.out.println(Thread.currentThread()+" is running.");
//                }
            }
        });

        threadOne.start();

        System.out.println(threadOne.getName() + " 's interrupt status flag is [" + threadOne.isInterrupted() + "] before running interrupt()");
        System.out.println("To interrupt the threadOne.");

        threadOne.interrupt();

        System.out.println("threadOne has run the interrupt() .");
        System.out.println(threadOne.getName() + " 's interrupt status flag is [" + threadOne.isInterrupted() + "] after running interrupt()");
    }
}
