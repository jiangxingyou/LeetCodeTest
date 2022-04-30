package com.company.中等;

public class 不同的二叉搜索树 {
    public static void main(String[] args) {
        System.out.println("不同的二叉搜索树");
        System.out.println(numTrees(3));
    }

    public static int numTrees(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int []dp = new int[n+1];//dp[i], 表示i个结点，从1到i的二叉搜索树的种数。
        //② 推导公式，dp[i] = 以j为头结点的搜索树，可以分为，以1到i-j,构建成左二叉搜索树；i-j+1到i构建右二叉搜索树;两者的情况相乘，即是结果。
        //③
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n ; i++) {//表示结点的数量
            for (int j = 1; j <= i; j++) {//表示j作为头结点
                dp[i] += dp[j-1]*dp[i-j];
            }

        }
        return dp[n];
    }
}
