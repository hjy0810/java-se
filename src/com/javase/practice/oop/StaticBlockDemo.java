package com.javase.practice.oop;

/**
 * 普通代码块和静态代码块
 * 普通代码块
 * 1。构造器的补充机制，调用顺序优先于构造器。
 * 2。多个构造器有重复语句可提取到代码块中
 * 3。每次创建对象都会执行一次
 * 静态代码块
 * 1。随着类的加载而执行，只会执行一次。
 *
 * 类加载时机？
 * 1。使用类的静态成员
 * 2。创建对象时，当前类及其父类都会被加载。而且父类先加载，子类后加载
 *
 * @author:hjy
 * @date 2023/10/5 21:03
 */
public class StaticBlockDemo {
    public static void main(String[] args) {

//        System.out.println(AA.A);
//        AA.aaStaticFunc();

//        BB.bbStaticFunc();
//        System.out.println(BB.B);

        /**
         * 创建对象的调用顺序
         * 1。调用父类静态代码块和父类静态成员初始化（按代码的先后顺序）
         * 2。调用子类静态代码块和子类静态成员初始化（按代码的先后顺序）
         * 3。调用父类的普通代码块
         * 4。调用父类构造器
         * 5。调用子类的普通代码块
         * 6。调用子类构造器
         */
//        AA aa= new AA();
        BB bb = new BB();

    }
}

class AA{
    int a=0;
    static int A=0;
    static {
//        A=1;
//        System.out.println(A);
        System.out.println("父类静态代码块执行");
    }

    {
        System.out.println("父类普通代码块执行");
    }

    public AA(){
        System.out.println("父类构造器方法执行");
    }

    public void aaFunc(){
        System.out.println("父类普通方法执行");
    }

    public static void aaStaticFunc(){
        System.out.println("父类静态方法执行");
    }
}

class BB extends AA{
    int b=0;
    static int B=0;
    public BB(){
        System.out.println("子类构造器方法执行");
    }
    {
        System.out.println("子类普通代码块执行");
    }
    static {
        System.out.println("子类静态代码块执行");
    }

    public void bbFunc(){
        System.out.println("子类普通方法执行");
    }

    public static void bbStaticFunc(){
        System.out.println("子类静态方法执行");
    }
}
