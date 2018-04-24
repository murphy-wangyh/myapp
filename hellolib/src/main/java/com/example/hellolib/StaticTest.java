package com.example.hellolib;

/**
 * Created by lenovo on 2018/4/9.
 */

class StaticDemo{
    public static void display(){
        System.out.println("static super class：hello");
    }
}

class StaticDemoTest extends StaticDemo{
    public static void display(){
        System.out.println("static sub class：nihao");
    }
}
class Demo{
    public void display(){
        System.out.println("unstatic super class：hello");
    }
}

class DemoTest extends Demo{
    public void display(){
        System.out.println("unstatic subclass：nihao");
    }
}

public class StaticTest {
    public static void main(String args[]){
        Demo d=new Demo();
        d.display();
        d=new DemoTest();//注意观察这条语句的输出，是输出hello还是nihao
        d.display();
        StaticDemo sd=new StaticDemo();
        sd.display();
        sd=new StaticDemoTest();
        sd.display();
        }
}
