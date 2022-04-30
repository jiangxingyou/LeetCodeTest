package com.company.简单;


public class 菲波那切数列 {

    public static void main(String [] args){
        System.out.println("菲波那切数列");
        System.out.println(fib(3));//⑤ test
    }

    public static int fib(int n){
        int dp[] = new int[n+1];//dp[i], 表示第i个fib的值；①
        for (int i = 0; i <= n; i++) {//遍历方向，从下到上 ④
            if(i == 0) dp[i] = 0;//dp数组初始化 ③
            else if(i == 1) dp[i] = 1;
            else dp[i] = dp[i-1] + dp[i-2];//递推公式 ②
        }
        return dp[n];
    }
}
