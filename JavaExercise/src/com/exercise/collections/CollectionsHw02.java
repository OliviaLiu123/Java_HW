package com.exercise.collections;


/*
使用ArrayList 完成对对象Car (name, price)的各种操作
1.add:添加单个元素
2.remove:删除指定元素
3.contains:查找元素是否存在
4.size:获取元素个数
5.isEmpty:判断是否为空
6.clear :清空
7.AddAll:添加多个元素
8.containsAll:查找多个元素是否都存在
9.removeAll:删除多个元素
使用增强for 和迭代器来遍历所有car, 需要重新Car 的toString 方法

 */

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsHw02 {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList();
        Car car1 = new Car("宝马",6000000);
        Car car2 = new Car("宾利",5000000);
        arraylist.add(car1);
        arraylist.add(car2);
        System.out.println(arraylist);

        //2.remove:删除指定元素
        arraylist.remove(car1);
        System.out.println(arraylist);
        //3.contains:查找元素是否存在
        System.out.println(arraylist.contains(car1));//F

        //4.size:获取元素个数
        System.out.println(arraylist.size());//1
        //5.isEmpty:判断是否为空

        System.out.println(arraylist.isEmpty());
        //6.clear :清空
//        System.out.println(arraylist.clear());
        //7.AddAll:添加多个元素
        arraylist.addAll(arraylist);//2 个宾利

        //8.containsAll:查找多个元素是否都存在
        System.out.println(arraylist.containsAll(arraylist));//T

        //9.removeAll:删除多个元素
        arraylist.remove(arraylist); //相当于清空

        //10 遍历
        arraylist.add(car1);
        arraylist.add(car2);
        for (Object o:arraylist){
            System.out.println(o);

        }

        //iteator 遍历
        System.out.println("==按迭代器处理");
        Iterator iterator = arraylist.iterator();
        while(iterator.hasNext()){
            Object next=iterator.next();
            System.out.println(next);
        }



    }

}

class Car{
    private String name;
    private double price;



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

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}