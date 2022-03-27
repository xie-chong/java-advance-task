package com.homework04;

import java.util.concurrent.Callable;

public class MyThread01 implements Callable {
    private int inputValue;
    Object resulst = 0;

    public MyThread01(int inputValue) {
        this.inputValue = inputValue;
    }

    @Override
    public Object call() {
        resulst = fibo(inputValue);
        System.out.println("计算结果：fibo(36) = " + resulst);
        return resulst;
    }

    private static int fibo(int a) {
        if (a < 2)
            return 1;
        return fibo(a - 1) + fibo(a - 2);
    }

}
