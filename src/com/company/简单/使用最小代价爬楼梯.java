package com.company.简单;

public class 使用最小代价爬楼梯 {
    public static void main(String[] args) {
        System.out.println("使用最小代价爬楼梯");
        int cost[] = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost){
        int n = cost.length;//有n个台阶，但是需要爬n+1个，第n个需要跨过；且从0开始，
        int dp[] = new int[n+1];//dp[i], 表示爬过下标为i个楼梯时，所需要的最小费用 ①
        //② 递推公式，dp[i] = min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2])；
        //③ 初始化；
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n ; i++) {
            dp[i] = Math.min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2]);
        }
        return dp[n];
    }
}
