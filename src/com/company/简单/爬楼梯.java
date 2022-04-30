package com.company.简单;

public class 爬楼梯 {
    public static void main(String[] args) {
        System.out.println("爬楼梯");
        System.out.println(climbStairs(1));
    }

    public static int climbStairs(int n){
        int dp[] = new int[n+1];//① dp[i], 表示爬i个楼梯有几种方式；
        //② 递推公式：dp[i] = dp[i-1] + dp[i-2];
        //③ 初始化，
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {//④ 遍历方向，从下到上
            if(i == 2){
                dp[i] = 2;
            }
            else{
                dp[i] = dp[i-1] + dp[i-2];
            }

        }
        return dp[n];
    }
}
