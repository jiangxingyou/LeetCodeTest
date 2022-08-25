package com.company.leetCode;

public class 合并两个有序数组 {
    public static void main(String[] args) {
        System.out.println("xx");
    }

    public void fun1(int[] nums1, int m,  int[] nums2, int n){
        int i = 0;
        int j = 0;
        while (i < m && j < n){
            if (nums1[i] > nums2[j]) {
                //倒了，应该反过来
                for (int k = m-1; k >= i; k--) {
                    nums1[k+1] = nums1[k];
                }
                nums1[i] = nums1[j];
                m++;
                j++;
            }else {
                i++;
            }
        }
        if (i == m && j < n){
            for (int k = j; k < n; k++) {
                nums1[i] = nums2[j];
            }
        }
    }

    //从后往前
    public void fun2(int[] nums1, int m,  int[] nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = m + n - 1;
        while (k >= 0){
            if (j >= 0 && i >= 0){
                if (nums1[i] < nums2[j]){
                    nums1[k] = nums2[j];
                    j--;
                    k--;
                }else{
                    nums1[k] = nums1[i];
                    k--;
                    i--;
                }
            }else if (j < 0 && i >= 0){
                nums1[k--] = nums1[i--];
            }else if(i < 0 && j >= 0){
                nums1[k--] = nums2[j--];
            }else{
                break;
            }
        }
    }
}
