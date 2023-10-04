package com.javase.practice.oop;

/**
 * @author:hjy
 * @date 2023/10/4 22:15
 */
public class OverloadDemo {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        double d=4.0;

        OverloadDemo demo = new OverloadDemo();
        demo.sum(a,b);
        demo.sum(a,b,c);//调用的
        demo.sum(a,d);
        demo.sum(d,a);

        int e=5;
        demo.sum(a,b,c,e);   //调用的可变参数方法
    }

    /**
     * 方法重载要求：
     * 1。方法名相同
     * 2。方法行参列表必须不同（类型、个数、顺序）
     * 3。返回类型不要求
     */
    public int sum(int a,int b){
        return a+b;
    }

    public double sum(int a,double b){
        return a+b;
    }

    public double sum(int a,int b,int c){
        return a+b+c;
    }

    public double sum(double a,double b){
        return a+b;
    }

    /**
     * 可变参数
     * 1。实参可以为0或多个，行参本质是数组。
     * 2。实参也可以直接传一个数组
     * 3。可变参数可以和其他参数一起使用，但一个方法中只能有一个可变参数，且只能放在行参列表的最后
     * @param nums
     * @return
     */
    public double sum(int...nums){
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            res+=nums[i];
        }
        return res;
    }
}
