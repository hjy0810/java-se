package com.javase.practice.oop;

/**
 * 方法重写/覆盖
 * 1。方法名和参数列表相同
 * 2。返回类型要么相同，要么子类方法的返回类型是父类方法返回类型的子类
 * 3。子类方法不能缩小父类方法的访问权限
 * @author:hjy
 * @date 2023/10/5 11:52
 */
public class OverrideDemo {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        System.out.println(subClass.f1());
    }
}

class Base {

    protected Object f1(){
       return new Object();
    }
}

class SubClass extends Base{
     public String f1(){
        return "subf";
    }
}