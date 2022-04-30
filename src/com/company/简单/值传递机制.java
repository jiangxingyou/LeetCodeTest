package com.company.简单;

public class 值传递机制 {
    public static void main(String[] args) {
        System.out.println("xxxxxx");
        NM jxy = new NM(1,"wwj");
        jxy.yell("yxl");
    }

    static class NM{
        int level;
        String name;
        NM(int level, String name){
            this.level = level;
            this.name = name;
        }
        void yell(String otherName){
            System.out.println("我"+name+"是牛马, 你"+otherName+"也是牛马.");
        }
    }
}
