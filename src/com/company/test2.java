package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class test2 {

    public static int lengthOfLongestSubstring(String s) {
        if(s==null) return 0;

        String j = String.valueOf(s.charAt(0));
        System.out.println(j);
        int n = s.length();
        String subStr = s.substring(1, n);
        HashSet<Character> jxy = new HashSet<Character>();
        for (int i = 0; i <n ; i++) {

        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("xxx");
        System.out.println(lengthOfLongestSubstring1("pwwkew"));
    }

    /*笨方法*/

    /**
     * 分为i，j；两个下标，进行前进；
     *  但是超时了；
     *  因为肯定有重复的情况；
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring1(String s) {
        if(s == null) return 0;
        int maxNum = 0;
        ArrayList<String> jjj = new ArrayList<>();
        String subS = null;

        for (int i = 0; i < s.length(); i++) {
            //将第一个字符都放进去；
            subS = ""+s.charAt(i);
            maxNum = Math.max(maxNum, subS.length());
            jjj.add(subS);
            for (int j = i+1; j < s.length(); j++) {
                //判断：1、子串中不能有重复的字符；
                /*  2、重复的子串无需进行判断；
                    3、子串长度小于最大子串的，不需要判断；
                * */
                subS = s.substring(i, j+1);//左闭右开的是
                int indexJ = subS.length()-1;
                char ccc = subS.charAt(indexJ);//当前判断的字符,子串的最后一位；
                int aIndex = subS.indexOf(ccc);//该字符在子串中第一次出现的位置；-1，表示没有;
                if(aIndex == indexJ){
                    if(subS.length() > maxNum){
                        if(!jjj.contains(subS)){
                            //且不在已经有list中
                            maxNum = subS.length();
                            jjj.add(subS);
                        }
                    }
                }else{
                    //直接开启下一个循环i；
                    break;
                }
            }
        }
        return maxNum;
    }

    /**
     * true 是重复的
     * false 没有重复的
     * 升级，两层for；
     * 转成一层了；
     * @param s
     * @return
     */
    public static boolean repeat_find(String s){
        for (int i = 0; i <s.length() ; i++) {
            char a = s.charAt(i);
            if (s.lastIndexOf(a) != i) {//向后搜索，找到索引和i不一致的，即存在重复的；
                return true;
            }
        }
        return false;
    }
    //超时；

}
