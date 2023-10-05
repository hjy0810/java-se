package com.javase.practice.oop;

/**
 * 类变量/方法和main方法
 * 类变量 又叫静态变量、静态属性
 * 1。该类所有实例对象共享的变量。实例变量是每个对象独享的
 * 2。在类加载的时候初始化。因此不必创建对象而可以使用它
 * 3。推荐使用方式 ==》 类.静态变量
 *
 * 类方法 又叫静态方法
 * 1。静态方法只可以调用静态成员。非静态方法可以调用静态成员和非静态成员
 * 2。静态方法中不能使用this。
 * 3。推荐使用方式 ==》 类.静态方法
 * 4。应用 ==》开发工具类，可以将方法做成静态的，方便调用。如Java中的Arrays类、 Math类、 Collections类
 *
 * main方法
 * 1。jvm调用，因此public
 * 2。调用的时候不必创建对象，因此static
 * 3。接受字符串数组，用于存储执行java命令时传递的参数
 * @author:hjy
 * @date 2023/10/5 20:29
 */
public class StaticAndMainDemo {
    public static void main(String[] args) {
        StaticVariable staticVariable1 = new StaticVariable();
        StaticVariable staticVariable2 = new StaticVariable();
        staticVariable1.addCount1();
        staticVariable2.addCount1();
        System.out.println("静态变量count="+StaticVariable.count);//推荐
        System.out.println("静态变量count="+staticVariable1.count);
    }
}

class StaticVariable{
    public int val=0;
    public static int count=0;
    public void addCount1(){
        count++;
    }
    public static void addCount2(){
        count++;
        addCount3();
    }

    public static void addCount3(){

    }
}