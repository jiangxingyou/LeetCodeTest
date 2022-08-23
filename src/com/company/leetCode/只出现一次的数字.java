package com.company.leetCode;

import java.util.HashSet;
import java.util.Set;

public class 只出现一次的数字 {
    public static void main(String[] args) {
        System.out.println("xxx");
    }

    public int fun(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            nums[0] = nums[0] ^ nums[i];
        }
        return nums[0];
    }

    //set 去重进行处理
    public int fun2(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if (set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        return (int) set.toArray()[0];
    }
}
