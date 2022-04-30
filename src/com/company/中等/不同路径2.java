package com.company.中等;

public class 不同路径2 {
    public static void main(String[] args) {
        System.out.println("不同路径2");
        int dp1[][] = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        System.out.println(uniquePathsWithObstracles(dp1));

        int dp[][] = new int[3][2];

        System.out.println(dp.length);
        System.out.println(dp[0].length);


    }

    public static int uniquePathsWithObstracles(int [][] obstacleGrid){
        int n = obstacleGrid.length;//表示行
        int m = obstacleGrid[0].length;//表示列
        int dp[][] = new int[n][m];//表示，dp[i][j], 从0,0到i,j有多少条路径；①
        //② 推导公式：dp[i][j] = dp[i-1][j] + dp[i][j-1],等于两条路径加起来，如果没有障碍的话
        //③ 初始化；
        dp[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;

        for (int i = 0; i < n; i++) {
            if(i>=1){
                dp[i][0] = obstacleGrid[i][0] == 1 ? 0 : dp[i-1][0];
            }
            for (int j = 0; j < m; j++) {
                if(j>=1){
                    dp[0][j] = obstacleGrid[0][j] == 1 ? 0 : dp[0][j-1];
                }
                if(i >=1 && j >= 1){
                    dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[n-1][m-1];
        //总结:这题的，初始化，还可以进行优化，
    }
}
