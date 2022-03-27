package com.homework04;

import java.util.concurrent.CountDownLatch;

public class MyThread02 extends Thread {
    Result result;
    int input;
    CountDownLatch cdl;

    public MyThread02(CountDownLatch cdl, Result result, int input) {
        this.input = input;
        this.cdl = cdl;
        this.result = result;
    }


    public void run() {
        int res = fibo(input);
        System.out.println("计算结果：fibo(36) = " + result);
        cdl.countDown();
        result.setResult(res);
    }

    private static int fibo(int a) {
        if (a < 2)
            return 1;
        return fibo(a - 1) + fibo(a - 2);
    }
}
