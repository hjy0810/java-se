package com.javase.practice.oop;

/**
 * 内部类
 * 1。成员内部类
 * 2。静态内部类
 * 3。局部内部类
 * 4。匿名内部类
 *
 * @author:hjy
 * @date 2023/10/6 21:00
 */
public class InnerClassDemo {
    public static void main(String[] args) {
        //成员内部类
//        MemberInnerClassOuter memberInnerClassOuter = new MemberInnerClassOuter();
//        MemberInnerClassOuter.MemberInnerClassInner innerClass = memberInnerClassOuter.getInnerClass();
//        innerClass.innerFunc1();


    }
}

/**
 * 成员内部类
 * 1。定义在类的成员位置上
 */
class MemberInnerClassOuter{
    private int outerVal1=1;
    private int outerVal2=2;
    private void outerFunc(){
        System.out.println("外部类方法outerFunc");
    }

    public class MemberInnerClassInner{
        private int outerVal1=3;
        private int innerVal=4;
        public void innerFunc1(){
            //获取内部类属性
            System.out.println("内部类属性outerVal1="+outerVal1);
            System.out.println("内部类属性innerVal="+innerVal);
            //获取内部类方法
            innerFunc2();
            /**
             * 获取外部类属性
             * 1.可以直接获取外部类私有成员
             * 2.不重名直接使用，重名要用 OuterClass.this.xxx 获取
             */
            System.out.println("外部类属性innerVal="+MemberInnerClassOuter.this.outerVal1);
            System.out.println("外部类属性innerVal="+outerVal2);
            //获取外部类方法
            outerFunc();
        }

        private void innerFunc2(){
            System.out.println("内部类方法innerFunc2");
        }
    }

    public MemberInnerClassInner getInnerClass(){
        return new MemberInnerClassInner();
    }
}

/**
 * 静态内部类
 * 1。定义在类的成员位置上
 * 2。有static关键字修饰 ==》 跟成员内部类相比，只能获取外部类的静态成员
 */
class StaticMemberInnerClassOuter{

}
