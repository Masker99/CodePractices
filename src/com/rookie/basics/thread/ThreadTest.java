package com.rookie.basics.thread;

/**
 * 利用Thread实现，要求多线程求解某范围素数每个线程负责1000范围：
 * 线程1找1-1000；
 * 线程 2 找 1001-2000；
 * 线程 3 找2001-3000。
 * 编程程序将每个线程找到的素数及时打印
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <=1000 ; i++){
                    int num = 0;
                    for(int j = 1 ; j <= i ; j++){
                        if( i % j == 0){
                            num++;
                        }
                    }
                    if(num <= 2){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                for (int i = 1001; i <=2000 ; i++){
                    int num = 0;
                    for(int j = 1 ; j <= i ; j++){
                        if( i % j == 0){
                            num++;
                        }
                    }
                    if(num <= 2){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        };

        Thread thread3 = new Thread(){
            @Override
            public void run() {
                for (int i = 2001; i <=3000 ; i++){
                    int num = 0;
                    for(int j = 1 ; j <= i ; j++){
                        if( i % j == 0){
                            num++;
                        }
                    }
                    if(num <= 2){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        };


        thread1.start();
        thread2.start();
        thread3.start();
    }
}
