package com.javase.practice.oop;

/**
 * 接口
 * 1。接口不能被实例化
 * 2。接口中所有的方法是 public 方法, 接口中抽象方法，可以不用 abstract 修饰
 * 3。一个普通类实现接口,就必须将该接口的所有方法都实现
 * 4。抽象类去实现接口时，可以不实现接口的抽象方法
 * 5。一个类可以实现多个接口
 * 6。接口中的属性,只能是 final 的，而且是 public static final 修饰符
 * 7。接口不能继承其它的类,但是可以继承多个别的接口
 *
 * 子类继承了父类，就自动的拥有父类的功能，如果子类需要扩展功能，可以通过实现接口的方式扩展.
 * 可以理解 接口 是对 java 单继承机制的一种补充
 * @author:hjy
 * @date 2023/10/6 13:50
 */
public class InterfaceDemo {
    public static void main(String[] args) {

    }
}

