package com.rookie.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 使用FutureTask方式创建线程
 * @author Masker
 */
public class CallerTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "use future task to create thread.";
    }

    public static void main(String[] args) {
        //创建线程
        FutureTask<String> futureTask = new FutureTask<>(new CallerTask());
        //启动线程
        new Thread(futureTask).start();

        try {
            //任务执行完毕，并返回结果
            String result = futureTask.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
