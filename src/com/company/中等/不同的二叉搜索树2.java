package com.company.中等;

import java.util.ArrayList;
import java.util.List;

public class 不同的二叉搜索树2 {
    public static void main(String[] args) {
        System.out.println("不同的二叉搜索树2");
    }

    /**
     * 二叉树
     */
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<TreeNode> generateTrees(int n){
        List<TreeNode> list = new ArrayList<>();//存放所有二叉搜索树
        int dp[] = new int[n+1];//
        for (int i = 0; i < n; i++) {
           //fun(i), 1-n,组成的二叉搜索树,且是以i为根结点；

        }
        return null;
    }
    //已j为顶点，进行构建子顺序树；i,为最大值。
    public TreeNode generateTT(int j, int i){
        if(j == 0) return null;
        TreeNode node = new TreeNode(j);
        node.left = generateTT(j-1, i);
        node.right = generateTT(i-j+1, i);
        return node;
    }
}
