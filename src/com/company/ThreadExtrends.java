package com.company;

public class ThreadExtrends {
    public static void main(String[] args) {
        System.out.println("xx");
        //创建自定义线程对象
        MyThread myThread = new MyThread("EAT");
        //这里还是主线程执行
//        myThread.run();
        //使用start方法，开始线程，并告诉jvm执行run方法；但是并不保证立即运行；由CPU调度执行；
        myThread.start();

        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+"i="+i);
        }

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println(Thread.currentThread().getName()+" j="+i);
                }
                super.run();
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println(Thread.currentThread().getName()+" i="+i);
                }
            }
        }).start();
    }
}
