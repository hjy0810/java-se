package com.javase.practice.oop;

/**
 * 抽象类
 * 解决父类方法不确定问题
 * 1。可修饰类和方法
 * 2。abstract类不能被实例化
 * 3。abstract类可以没有abstract方法，但有abstract方法的类一定要是abstract类
 * 4。abstract方法不能有方法体
 * 5。一个类继承了abstract类，则必须实现所有的abstract方法，除非它自己也声明为abstract类
 * 6。abstract方法不能用private final static修饰，因为这些修饰符都与重写相违背
 * 7。抽象类的价值更多在于设计方面，体现了模板设计模式。
 * @author:hjy
 * @date 2023/10/5 23:59
 */
public class AbstractDemo {
    public static void main(String[] args) {
        CommonEmployee jack = new CommonEmployee(1001, "jack", 3000);
        jack.work();

        Manager tom = new Manager(1100, "tom", 5000,3000);
        tom.work();
    }
}
abstract class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public abstract void work();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee{
    private double bounce;

    public Manager(int id, String name, double salary, double bounce) {
        super(id, name, salary);
        this.bounce = bounce;
    }

    @Override
    public void work() {
        System.out.println("经理"+getName()+"正在工作中");
    }
}

class CommonEmployee extends Employee{
    public CommonEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工"+getName()+"正在工作中");
    }
}