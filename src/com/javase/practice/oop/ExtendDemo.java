package com.javase.practice.oop;

/**
 * 继承
 * 1。子类继承父类的属性和方法（遵循访问修饰符）
 * 2。子类构造器中会调用父类的构造器方法，完成父类的初始化
 *      父类没有无参构造器，子类构造器中需要显式调用父类的有参构造器语句
 *      父类有无参构造器，子类构造器无需显式调用父类的无参构造器，由jvm默认调用；当然也可显式调用父类指定的构造器
 * 3。子类显式调用父类的构造器方法的语句必须放在子类构造器方法的第一行  ==》 super(参数列表)
 *      因此 super(参数列表) 和  this(参数列表) 无法同时存在于同一个构造器方法
 * 4。java是单继承模式，但可访问父类的基类...
 * @author:hjy
 * @date 2023/10/5 10:47
 */
public class ExtendDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("大黄", 3, "yellow");
        /**
         * 创建dog对象的简易过程
         * 1。加载类信息。包括Dog类及其父类...
         * 2。堆内存开辟空间
         * 3。初始化。包括默认初始化和显示初始化
         * 4。将对象的堆内存地址返回给外部变量
         */
        dog.say();
        dog.printInfo();
    }
}

class Animal{
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Dog extends Animal{
    private String color;

    public Dog(String name, int age, String color) {
        //父类没有无参构造器，子类显式调用父类有参构造器
        super(name, age);
        this.color = color;
    }

    public void say(){
        System.out.println("汪汪~");
    }

    public void printInfo(){
        System.out.println("name="+super.getName()+",age="+super.getAge()+",color="+color );
    }
}
