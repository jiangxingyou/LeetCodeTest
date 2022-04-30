package com.company.中等;

public class 不同路径 {
    public static void main(String[] args) {
        System.out.println("不同路径");
        System.out.println(uniquePaths(2,3));
    }

    public static int uniquePaths(int n, int m){
        int dp[][] = new int[n+1][m+1];//dp[i][j], 表示从[0][0]到[i][j]的路径条数；①
        //② 推导公式：dp[i][j] = dp[i-1][j] + dp[i][j-1];
        //③ 初始化
        for (int i = 1; i <= n; i++) {
            dp[i][1] = 1;
            for (int j = 1; j <= m; j++) {
                dp[1][j] = 1;
                if(i >= 2 && j >= 2){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[n][m];
    }
}
