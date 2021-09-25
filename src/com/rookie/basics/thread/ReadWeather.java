package com.rookie.basics.thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReadWeather implements Runnable{
    private Weather weather;
//    private ReentrantLock lock = new ReentrantLock(true);

    public ReadWeather(Weather weather){
        this.weather = weather;
    }

    @Override
    public void run() {
        for (int i = 0 ; i < 100 ; i++){
//            lock.lock();
            try {
                Thread.sleep(100);
//                synchronized (weather){
                    weather.read();
//                    weather.wait();
//                    weather.notifyAll();
//                    weather.wait();
//                }
//                weather.read();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            lock.unlock();
        }
    }
}
