package com.company.leetCode;

import java.util.ArrayList;
import java.util.List;

public class 分割回文串 {
    public static void main(String[] args) {
        System.out.println("xxxx");
    }

    public List<List<String>> fun1(String s){
        //dp 三部曲；
        //① 确认 dp[i]的含义：dp[i]指 从0-i个字符的分割解决方案；
        List<List<String>> dp = new ArrayList<>();
        //② 确认起点和终点，dp[s.charAt[0]]
        List<String> temp = new ArrayList<>();
        temp.add(String.valueOf(s.charAt(0)));
        dp.add(temp);

        for (int i = 1; i < s.length(); i++) {//表示的是，字符串的字符index
            int n = dp.size();
            for (int j = 0; j < n; j++) {//表示大结点
                List<String> temp1 = new ArrayList<>();//临时结点
                temp1 = dp.get(j);//暂存值
                //直接修改现有的列表；现有的结点，直接加上一个值；
                dp.get(j).add(String.valueOf(s.charAt(i)));
                //将新的字符，拼接到每个list的最后一个结点上，判断是否是回文；是的话，就加上这种情况；
                String str = temp1.get(temp1.size() - 1) + s.charAt(i);
                String rStr = new StringBuffer(str).reverse().toString();
                System.out.println("rStr:"+rStr);
                if (str.equals(rStr)){//如果最后一个结点，拼接上后，还是回文
                    temp1.set(temp1.size() - 1, rStr);
                    dp.add(temp1);
                }
            }
        }
        return dp;
    }
}
