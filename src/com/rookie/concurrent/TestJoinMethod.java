package com.rookie.concurrent;

/**
 * 测试Thread的join方法
 * @author masker
 * @date 2022-1-16
 */
public class TestJoinMethod {
    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("ThreadOne had run over.");
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("ThreadTwo had run over.");
            }
        });

        threadOne.start();
        threadTwo.start();

        System.out.println("Wait all thread over.");
        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("all thread over.");

    }
}
