package com.company;

public class test3 {
    public static void main(String[] args) {
        System.out.println("两个正序数组的中位数：先合并，然后根据，奇数、偶数来返回中位数");
        int[] num1 = {1,3};
        int[] num2 = {2};
        System.out.println(findMedianSortedArrays(num1, num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double medianNum = 0;
        int n = nums1.length;
        int m = nums2.length;
        int c = m + n;

        int[] nums3 = new int[c];
        int j, k, i;
        j = 0;
        k = 0;
        i = 0;
        while (i < c){
            if(j < n && k < m){
                if(nums1[j] < nums2[k]){
                    nums3[i] = nums1[j++];
                }
                else{
                    nums3[i] = nums2[k++];
                }
            }else if(j >= n && k < m){
                nums3[i] = nums2[k++];
            }else if(j < n && k >= m){
                nums3[i] = nums1[j++];
            }else{

            }
            System.out.println("i:"+i+"值："+nums3[i]);
            i++;
        }

        int flag = c % 2;
        int medianIndex = c / 2;
        if(flag == 1){
            medianNum =  nums3[medianIndex];
            System.out.println("我是奇数:"+medianIndex);
        }else {
            medianNum =  (nums3[medianIndex-1] + nums3[medianIndex]) / (double)2;
            System.out.println("我是偶数:"+medianIndex);
        }
        return medianNum;
    }
}
