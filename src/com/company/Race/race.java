package com.company.Race;

public class race implements Runnable{

    private static String winner;

    public static void main(String[] args) {
        race race = new race();
        new Thread(race, "兔子").start();
        new Thread(race,"乌龟").start();
    }
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(Thread.currentThread().getName().equals("兔子") && i%10==0){
                try {
                    Thread.sleep(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            boolean flag = gameover(i);
            if(flag){
                break;
            }else{
                System.out.println(Thread.currentThread().getName()+"-->跑了"+i+"步");
            }
        }


    }

    private boolean gameover(int step){
        if(winner != null){
            return true;
        }else{
            if(step >= 100){
                winner = Thread.currentThread().getName();
                System.out.println("winner="+winner);
                return true;
            }
        }
        return false;
    }
}
