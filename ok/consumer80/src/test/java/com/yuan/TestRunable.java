package com.yuan;

public class TestRunable implements Runnable {
    volatile int a = 10;
    @Override

    public  void  run() {
        synchronized(this){
            if (a > 0) {
                System.out.println(Thread.currentThread().getName() + "卖了第" + a-- + "张票," + "剩余" + a + "张票");
            }

        }

    }
}
