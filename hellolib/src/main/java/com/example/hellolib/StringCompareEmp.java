package com.example.hellolib;

/**
 * Created by lenovo on 2018/4/11.
 */

public class StringCompareEmp{
    public static void main(String args[]){
        String str = "Hello World";
        String anotherString = "hello world";
        Object objStr = str;

        System.out.println( str.compareTo(anotherString) );
        System.out.println( str.compareToIgnoreCase(anotherString) );  //忽略大小写
        System.out.println( str.compareTo(objStr.toString()));
    }
}
