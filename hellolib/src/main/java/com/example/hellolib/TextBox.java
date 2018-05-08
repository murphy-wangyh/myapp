package com.example.hellolib;

/**
 * Created by lenovo on 2018/5/8.
 */

public class TextBox {
    Integer i = 0;//must give a default value
    int j;

    public static void main (String[] args) {
        TextBox t = new TextBox();
        t.go();
    }

    public void go() {
        j=i;
        String s="2";
        System.out.println(j);
        System.out.println(i);
        System.out.println(Integer.parseInt(s));// parse string to int
    }
}
