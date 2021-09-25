package com.rookie.basics.thread;

public class WeatherTest {
    public static void main(String[] args) {
        Weather weather = new Weather();
        GenerateWeather generateWeather = new GenerateWeather(weather);
//        generateWeather.setPriority(8);

        ReadWeather readWeather = new ReadWeather(weather);
        Thread readWeatherThread = new Thread(readWeather);

        generateWeather.start();
        readWeatherThread.start();
    }
}
