package com.company;

public class test4 {
    public static void main(String[] args) {
        System.out.println("最长回文子串");
        System.out.println("babbb");
        System.out.println(longestPalindrome("babbb"));

    }
    public static String longestPalindrome(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];//dp[i][j]，表示下标从i到j的子串（左闭右闭），是否是回文子串；
        //1、dp数组的意义，且默认是false
        //2、确认递推公式；
            /*
                1、s[i] == s[j]
                    1、i==j，‘a’
                    2、i==j-1，‘aa’
                    3、dp[i+1][j-1],true,则是true；
                2、s[i] != s[j] dp[i][j]，false,默认是false，不需要考虑了
            * */
        //3、dp数组初始化，默认应该都是false
        //4、确认遍历顺序
        //5、举例推导dp数组,'aaa'
        //最长的回文子串
        int a, b, c;
        a = 0;
        b = 0;
        c = 0;
        for (int i = n-1; i >=0; i--) {//从下到上
            for (int j = i; j < n; j++) {//从左到右
                if(s.charAt(i) == s.charAt(j)){
                    if(i == j || i == j-1){
                        dp[i][j] = true;
                    }
                    else if(dp[i+1][j-1]){//当上一个阶段，为TRUE时
                        dp[i][j] = true;
                    }
                }

                //如果在里面判断，需要写在两个地方；单独拿出来判断
                if(dp[i][j] && j-i+1 > c){
                    c = j-i+1;
                    a = i;
                    b = j;
                }
            }
        }
        return s.substring(a,b+1);
    }
}
