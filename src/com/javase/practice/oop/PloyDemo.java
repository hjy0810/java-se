package com.javase.practice.oop;

/**
 * 多态：方法和对象具有多种形态
 * 方法的多态
 *  1。重载
 *  2。重写
 * 对象的多态。（前提是具有继承关系）
 * 1。等号左边是编译类型，右边是运行类型。一旦对象初始化，编译类型不可变，运行类型可变。
 * 2。对对象属性的调用没有动态绑定，看编译类型
 * 3。对对象方法的调用有动态绑定，看运行类型
 * 向上转型  ==》 父类 引用名=new 子类类型();
 * 1。父类的引用指向子类对象
 * 2。可调用父类成员，不可调用子类成员。
 * 3。运行效果看子类的具体实现（从子类开始寻找调用的方法）
 * 向下转型  ==》 子类 引用名=(子类) 父类引用；
 * 向下转型后可以调用子类的成员
 *
 * 多态应用
 * 1。多态数组：数组的类型为父类，元素的类型为子类（可多种子类）
 * 2。多态参数：实参的类型为父类，实参的类型为子类
 * @author:hjy
 * @date 2023/10/5 16:53
 */
public class PloyDemo {
    public static void main(String[] args) {
        Animal1 cat1=new Cat1();
        //运行类型可变
//        cat1=new Dog1();
        Animal1 dog1=new Dog1();
        //属性不会动态绑定。看编译类型
        System.out.println("cat.name="+cat1.name);
        System.out.println("dog.name="+dog1.name);

        //方法会动态绑定，看运行类型
        cat1.run();
        dog1.eat();
        cat1.sleep();
        dog1.sleep();

        //向上转型，不能调用子类特有的方法
        Animal1 cat2=new Cat1();
        Animal1 dog2=new Dog1();
        cat2.run();
        dog2.eat();
        cat2.sleep();
        dog2.sleep();
        //判断对象的运行类型
        System.out.println(cat2 instanceof Cat1);
        System.out.println(dog2 instanceof Dog1);
        System.out.println(cat2 instanceof Animal1);
        System.out.println(dog2 instanceof Animal1);

        //向下转型
        Cat1 cat3=(Cat1)cat2;
        Dog1 dog3=(Dog1)dog2;
        cat3.say();
        dog3.say();
    }
}

class Animal1{
    String name="animal";

    public void run(){
        System.out.println("animal is running");
    }

    public void eat(){
        System.out.println("animal is eating");
    }

    public void sleep(){
        System.out.println("animal is sleeping");
    }
}

class Cat1 extends Animal1{
    String name="cat";

    public void run(){
        System.out.println("cat is running");
    }

    public void eat(){
        System.out.println("cat is eating");
    }

    public void say(){
        System.out.println("cat is saying 喵喵～");
    }
}

class Dog1 extends Animal1{
    String name="dog";

    public void run(){
        System.out.println("dog is running");
    }

    public void eat(){
        System.out.println("dog is eating");
    }

    public void say(){
        System.out.println("dog is saying 喵喵～");
    }
}
