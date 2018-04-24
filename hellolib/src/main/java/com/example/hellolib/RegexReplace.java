package com.example.hellolib;

/**
 * Created by lenovo on 2018/4/9.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexReplace {
        private static String REGEX = "cat";
        private static String INPUT = "fatcatfatcatfat";
        private static String REPLACE = "dog";
        public static void main(String[] args) {
            Pattern p = Pattern.compile(REGEX);
            // 获取 matcher 对象
            Matcher m = p.matcher(INPUT);
            StringBuffer sb = new StringBuffer();
            while(m.find()){
                m.appendReplacement(sb,REPLACE);
            }
            System.out.println(sb.toString());
            m.appendTail(sb);
            System.out.println(sb.toString());
        }
}
