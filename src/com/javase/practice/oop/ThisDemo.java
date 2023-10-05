package com.javase.practice.oop;

/**
 * this
 * 1。this用于区分类的属性和方法中的局部变量
 * 2。this只能用于方法中
 * 3。this可以访问类的属性，方法，构造器；但访问构造器的语句只能用在其他的构造器方法的第一行 ==》 this(参数列表)，这里this指构造器
 * 4。一般而言，那个对象调用的该方法，该方法中的this就代表谁
 * @author:hjy
 * @date 2023/10/5 09:49
 */
public class ThisDemo {
    public static void main(String[] args) {
        User jack = new User("jack", 30);
        User shell = new User("shell", 25);
        jack.print();
        shell.print();
    }
}

class User{
    private String name;
    private int age;
    User(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void print(){
        String printInfo="";
        printInfo();
    }

    public void printInfo(){
        String name="alex";
        int age=20;
        System.out.println("name="+name+" and age="+age);
        System.out.println("name="+this.name+" and age="+this.age);
    }


}
