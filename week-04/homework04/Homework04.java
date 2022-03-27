package com.homework04;

import java.util.concurrent.*;

public class Homework04 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // 方法一 Callable
/*
        Object result = method01();
        System.out.println("返回结果：" + result);
        System.out.println("主线程退出");
        */

        // 方法二 CountDownLatch
       /*
        CountDownLatch cdl = new CountDownLatch(1);
        Result result = new Result();
        method02(cdl, result);
        cdl.await();

        System.out.println("返回结果：" + result.getResult());
        System.out.println("主线程退出");*/


        // 方法三 sleep
/*
        Result result = new Result();
        method03(result);
        Thread.sleep(1000);
        System.out.println("返回结果：" + result.getResult());
        System.out.println("主线程退出");*/


        // 方法四 join
        Result result = new Result();
        method04(result);
        System.out.println("返回结果：" + result.getResult());
        System.out.println("主线程退出");
    }

    private static Object method01() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        MyThread01 myThread = new MyThread01(36);
        // 提交任务
        Future<Object> future = executor.submit(myThread);
        Object result = future.get();
        return result;
    }


    private static void method02(CountDownLatch cdl, Result result) {
        MyThread02 myThread = new MyThread02(cdl, result, 36);
        myThread.start();
    }


    private static void method03(Result result) {
        MyThread03 myThread = new MyThread03(result, 36);
        myThread.start();
    }

    private static void method04(Result result) throws InterruptedException {
        MyThread03 myThread = new MyThread03(result, 36);
        myThread.start();
        myThread.join();
    }


}
