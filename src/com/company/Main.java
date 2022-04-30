package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("xxxxx");
        for (int i = 0; i < 3; i++) {

            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("这是第"+(finalI +1)+"个线程开始执行");
                    for (int j = 0; j <10 ; j++) {
                        getCount();
                    }
                    System.out.println("这是第"+(finalI +1)+"个线程结束执行");
                }
            }).start();
        }

        
    }

    static int count = 0;
    public static void getCount(){
        count++;
        System.out.println("count="+ count);
    }
}
