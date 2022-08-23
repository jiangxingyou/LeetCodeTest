package com.company.leetCode;

public class 搜索二维矩阵 {
    public static void main(String[] args) {
        System.out.println("xxx");
    }

    public boolean fun(int[][] matrix, int target){
        int m = matrix.length;//行
        int n = matrix[0].length;//列
        int medianX = 0;
        int medianY = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n){
            medianX = m / 2;
            medianY = n / 2;
            if (target == matrix[medianX][medianY]){
                return true;
            }else if(target < matrix[medianX][medianY]){
                //
            }
            i++;
            j++;
        }
        return false;
    }
}
