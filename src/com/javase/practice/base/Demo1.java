package com.javase.practice.base;

/**
 * @author:hjy
 * @date 2023/10/4 16:32
 */
public class Demo1 {
    public static void main(String[] args) {
        //当定义的数字超过了int的范围，后面必须加L了。
        long l1=12L;
        long l2=12;
        long l3=12345678901L;
        System.out.println(l1==l2);

        float f=1.2f;
        double d=1.2e-3;

        Double i1=Math.pow(2,30)-1;
        double i2=Integer.MAX_VALUE;
        System.out.printf("%d,%b\n",Integer.MAX_VALUE,Integer.MAX_VALUE==Math.pow(2,31)-1);
        System.out.printf("%b\n",i1==i2);
        System.out.println(i1.getClass().getName());

        int a=1223;
        String str=Integer.toString(a,2);
        System.out.println(str);


    }


}
