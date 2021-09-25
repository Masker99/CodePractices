package com.rookie.basics.thread;

import java.util.concurrent.locks.ReentrantLock;

public class GenerateWeather extends Thread{
    private Weather weather;
//    private ReentrantLock lock = new ReentrantLock(true);
    public GenerateWeather(Weather weather){
        this.weather = weather;
    }

    @Override
    public void run() {
        for (int i = 0 ; i < 100 ; i++){
//            lock.lock();
            try {
                Thread.sleep(5000);
//                synchronized (weather){
                    weather.generate();
//                    weather.wait();
//                    weather.notifyAll();
//                    weather.wait();
//                }
//                weather.generate();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            lock.unlock();
        }
    }
}
