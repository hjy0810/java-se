package com.javase.practice.singleton;

/**
 * 单例模式
 * 保证某个类只存在一个实例对象
 * 实现
 * 1。需要将构造器私有化，防止直接new的方式创建对象
 * 2。在类中创建对象
 * 3。通过一个public方法将创建的对象返回给外部
 * 饿汗式
 * 1。直接创建 =》通常是重量级对象，如果创建而未使用，会造成内存和性能浪费
 * 2。不存在线程安全问题
 * 懒汉式
 * 1。用的时候创建
 * 2。存在线程安全问题
 * @author:hjy
 * @date 2023/10/5 22:49
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton1 instance1=Singleton1.getInstance();
        Singleton1 instance2=Singleton1.getInstance();
        System.out.println(instance1==instance2);

        Singleton2 instance3=Singleton2.getInstance();
        Singleton2 instance4=Singleton2.getInstance();
        System.out.println(instance3==instance4);
    }
}

class Singleton1{
    //饿汗式 ==》 直接创建
    private static final Singleton1 instance=new Singleton1();
    private Singleton1(){

    }
    public static Singleton1 getInstance(){
        return instance;
    }
}

class Singleton2{
    private static Singleton2 instance;
    private Singleton2(){}
    public static Singleton2 getInstance(){
        //懒汉式 ==》 使用的时候创建
        if (instance==null){
            instance=new Singleton2();
        }
        return instance;
    }
}
