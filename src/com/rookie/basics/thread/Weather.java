package com.rookie.basics.thread;

import java.util.Random;

public class Weather {
    private Integer temperature;
    private Integer humidity;
    private boolean flag;

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public synchronized void generate() throws InterruptedException {
        Random random = new Random();
        if (flag){
            wait();
        }
        setTemperature(random.nextInt(40));
        setHumidity(random.nextInt(100));
        setFlag(true);
        System.out.println("生成天气数据[温度"+getTemperature()+",湿度"+getHumidity()+"]");
        notifyAll();
    }

    public synchronized void read() throws InterruptedException {
        if(flag){
            System.out.println("读取天气数据[温度"+getTemperature()+",湿度"+getHumidity()+"]");
            setFlag(false);
            notifyAll();
        }else{
            wait();
        }
    }
}
