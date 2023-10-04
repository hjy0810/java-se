package com.javase.practice.oop;

/**
 * 构造器方法
 * 1。完成对象的初始化，创建对象的时候由java虚拟机自动调用
 * 2。方法名和类名相同，无返回值
 * 3。可重载，不显示写构造器也有一个无参构造器；显示写了有参构造器，无参构造器消失，想要使用必须显示写出无参构造器
 * 4。可加修饰符，四种修饰符皆可
 * @author:hjy
 * @date 2023/10/4 22:57
 */
public class ConstructorDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("jack");
        Person person3 = new Person("alex", 30);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }
}

class Person{
    private String name;
    private int age;

    public Person(){}

    Person(String name){
        this.name=name;
    }

    protected Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}