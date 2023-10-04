package com.javase.practice.oop;

/**
 * 作用域
 * 1。类作用域中的属性可不赋值而直接使用，因为有默认值
 * 2。方法中的局部变量没有默认初始化，使用之前必须赋值
 * 3。类的属性和方法中的局部变量可重名，遵循就近原则
 * 4。属性可加修饰符，局部变量不行
 * @author:hjy
 * @date 2023/10/4 22:39
 */
public class ScopeDemo {
    //可不初始化，默认初始化为0
    public int val1;
    public static void main(String[] args) {
        ScopeDemo demo = new ScopeDemo();
        demo.test();

    }

    void test(){
        //必须初始化，不能加修饰符
//        public int val1=10;
        int val1=10;
        int val2=10;
        System.out.println(val1);
        System.out.println(val2);
    }
}
