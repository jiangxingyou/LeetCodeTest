package com.company.中等;

public class 整数拆分 {
    public static void main(String[] args) {
        System.out.println("整数拆分");
        System.out.println(intergerBreak(10));
    }
    //求最大乘积，等于求所有的乘积；
    public static int intergerBreak(int n){
       int dp[] = new int [n+1];//分拆数字i，dp[i]是其最大乘积；
        //② dp[i]是怎么得到呢？推导公式，
        //dp[i] = max(j*(i-j), j*dp[i-j]);

        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i ; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]) );
            }
            dp[i] = curMax;
        }
        return dp[n];
    }
}
