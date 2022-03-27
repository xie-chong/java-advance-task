package com.homework04;

import java.util.concurrent.CountDownLatch;

public class MyThread03 extends Thread {
    Result result;
    int input;

    public MyThread03(Result result, int input) {
        this.input = input;
        this.result = result;
    }


    public void run() {
        int res = fibo(input);
        System.out.println("计算结果：fibo(36) = " + result);
        result.setResult(res);
    }

    private static int fibo(int a) {
        if (a < 2)
            return 1;
        return fibo(a - 1) + fibo(a - 2);
    }
}
