package com.company.leetCode;

import java.util.Locale;
import java.util.regex.Pattern;

public class 验证回文串 {
    public static void main(String[] args) {
        System.out.println("xx");
        fun1("xSDZss,13fs, 78\n\r87"+"+shaaaaad-shkf,ss,s");
    }

    public static boolean fun1(String str){
        str = str.toLowerCase();
        str = str.replaceAll("[^A-Z|0-9|a-z]", "");
        System.out.println("str:\n"+str);
        int i = 0;
        int j = str.length()-1;
        while (i <= j){
            if (str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
