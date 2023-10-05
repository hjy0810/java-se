package com.javase.practice.oop;

/**
 * final关键字
 * 可以修饰类、属性、方法、局部变量
 * 1。修饰类。不可以被继承
 * 2。修饰属性。值不可更改。（可不初始化，一经初始化，不可更改）
 *    普通属性定义时不初始化，可在 代码块/构造器 任选一处初始化
 *    静态属性定义时不初始化，可在 静态代码块中初始化
 * 3。修饰方法。不可被重写
 * 4。修饰局部变量。值不可更改
 * final修饰的变量一般是常量，使用 XXX_XXX_XXX 命名
 * @author:hjy
 * @date 2023/10/5 23:30
 */
public class FinalDemo {
    public static void main(String[] args) {
        A a = new A();
        a.eat();
    }
}

class A{
    final int VAL;
    {
        VAL=1;
    }
//    A() {
//        VAL=2;
//    }

    final static int COUNT;
    static {
        COUNT=1;
    }

    public final void eat(){
        final int RES;
        RES=1;
        System.out.println(RES);
    }
}

final class B extends A{
//    @Override
//    public void eat() {
//        super.eat();
//    }
}

//class C extends B{
//
//}

