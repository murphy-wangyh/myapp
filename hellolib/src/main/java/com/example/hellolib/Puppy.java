package com.example.hellolib;

/**
 * Created by lenovo on 2018/4/3.
 */

public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        System.out.println("puppy name:" + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("puppy age is " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("tommy");
        myPuppy.setAge(3);
        myPuppy.getAge();
        System.out.println("tommy 的年龄:" + myPuppy.puppyAge);
    }
}
