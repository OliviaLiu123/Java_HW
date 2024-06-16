package com.exercise.arrays_;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/*
自定义一个Book 类，里面包含name 和price ,按price 排序（从大到小）。要求使用两种方式排序，对对象的某个属性排序，有一个
Book[] books=5 本书对象
排序：price(1)从大到小 2） 从小到大 3） 按照书名长度从大到小
 */
public class ArrayTest implements Comparable {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0]=new Book("红楼梦",100);
        books[1]=new Book("金瓶梅新版",90);
        books[2]=new Book("青年文摘20年出版",5);
        books[3]=new Book("Java 入门",300);

        // 1)按照price 从大到小
//        Arrays.sort(books,new Comparator(){
//            //这里是对Book 数组排序，因此
//
//        });





    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
class Book{
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

    private String name;
    private double price;


}