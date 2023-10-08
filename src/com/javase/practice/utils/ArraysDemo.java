package com.javase.practice.utils;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author:hjy
 * @date 2023/10/7
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{2,6,8,1,90,-10,43};

        System.out.println(Arrays.toString(arr));

        int[] arr1=Arrays.copyOf(arr,5);
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.binarySearch(arr1,2));

        int[] arr2=Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.equals(arr,arr2));

        //定制排序
        Integer[] arr3=new Integer[]{2,1,5,90,43,2,76};
        Arrays.sort(arr3,new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                int i1=(Integer)o1;
                int i2=(Integer)o2;
                return i1-i2;
            }
        });
        System.out.println(Arrays.toString(arr3));

        System.out.println(Arrays.asList(arr3));
        System.out.println(Arrays.asList(arr3).getClass());

        //对象定制排序
        Book[] books = new Book[4];
        books[0]=new Book("红楼",100);
        books[1]=new Book("三国",10);
        books[2]=new Book("水浒",1);
        books[3]=new Book("西游",1000);
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int)(o1.getPrice())-(int)(o2.getPrice());
            }
        });
        System.out.println(Arrays.toString(books));
    }
}

class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


