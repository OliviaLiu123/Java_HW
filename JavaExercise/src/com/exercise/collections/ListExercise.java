package com.exercise.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
添加10个以上的元素（比如String "hello"）在2号位插入一个元素"韩顺平教育"，获得第5个元素，删除第6个元素，修改第7个元素，在使用
迭代器遍历集合 要求：使用 list的实现类ArrayList 完成
 */
public class ListExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list =new ArrayList();
        for (int i =0;i<12;i++){
            list.add("hello"+i);
        }
        System.out.println(list);
        //在2号位插入一个元素"韩顺平教育"，
        list.add(1,"韩顺平教育");

        //获取第5个元素
        System.out.println("第五个元素"+list.get(4));

        //删除第6个元素
        list.remove(5);
        System.out.println(list);

        //修改第7个元素
        list.set(6,"修改了第7个元素");
        System.out.println(list);

        // 使用迭代器遍历
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println("obj="+obj);
        }


    }

}
