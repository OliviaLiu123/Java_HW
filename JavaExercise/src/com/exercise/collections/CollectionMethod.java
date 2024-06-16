package com.exercise.collections;

import java.util.ArrayList;
import java.util.List;
//用Arraylist 来实现
public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        // 用接口来接收
        List list=new ArrayList();

        // collection 接口的基本操作
        //add:添加元素

        list.add("jack");
        list.add(10); //list.add(new Integer(10))添加单个元素-单列集合
        list.add(true);
        System.out.println("list"+list);
        //remove:删除指定元素
        list.remove(0);// 删除第一个元素
        System.out.println("after remove 0 list"+list);
        list.remove(true);//删除某个对象
        System.out.println(list);


        //contains:查找某个元素是否存在
        //看某个元素是否存在返回布尔值
        System.out.println(list.contains("jack"));

        //size 获取元素个数
        System.out.println(list.size());

        //isEmpty: 判断是否为空
        System.out.println(list.isEmpty());

        //clear:清空
//        list.clear();
//        System.out.println("list="+list);
        //addAll:添加多个元素
        ArrayList list2=new ArrayList();
        list2.add("三国演义");
        list2.add("红楼");
        list.addAll(list2);//可以传入一个集合
        System.out.println("after add list2 list ="+list);

        //containsAll:查找多个元素是否存在
        System.out.println(list.containsAll(list2));
        //removeAll:删除多个元素

        list.removeAll(list2);
        list.add("java");
        System.out.println("after remove list2 list="+list);


    }

}
