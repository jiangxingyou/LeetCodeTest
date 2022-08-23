package com.company.leetCode;

import java.util.*;

public class 多数元素 {


    public static void main(String[] args) {
        System.out.println("xxx");
    }
    //排序后，中间值，就是多数元素。
    public int majorityElement(int[] nums){
        int temp;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = nums.length-1; j > i ; j--) {
                if (nums[j] < nums[j-1]) {
                    temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int end = nums.length/2;
        return nums[end];
    }
    //排序后，中位数，就是多数元素。
    //要求，时间为o（n），空间为1；
    public int majorityElement1(int[] nums){
        Arrays.sort(nums);
        int end = nums.length/2;
        return nums[end];
    }

    //摩尔投票法
    //要求，时间为o（n），空间为1；
    public int majorityElement2(int[] nums){
        int count = 1;
        int mostNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                mostNum = nums[i];
                count++;
            } else if (nums[i] == mostNum){
                count++;
            }else{
                count--;
            }
        }
        return mostNum;
    }

    //Map实现，key，value
    //key，记录值，value，记录次数
    public int majorityElement3(int[] nums){
       Map<Integer, Integer> map = new HashMap<>();
       int temp;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                temp = map.get(nums[i]);
                map.replace(nums[i], ++temp);
                if (temp > nums.length / 2) {
                    return nums[i];
                }
            }else{
                map.put(nums[i], 1);
                if (1 > nums.length / 2) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
