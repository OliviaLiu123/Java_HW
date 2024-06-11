package com.exercise.collections;

/*
下面代码会不会抛出异常，并从源码层面说明原因（考察 读源码+接口编程+动态绑定）

TreeSet treeSet = new TreeSet()
treeSet.add(new Person())
 */

import java.util.TreeSet;

public class CollectionsHw05 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        //分析：
        //add 方法：因为TreeSet()构造器没有传入Comparator 接口的匿名内部类
        //所以在底层 Comparable<? super K> k= (Comparable<? super k1>).key
        //即把


        treeSet.add(new Person());// 会报错-ClassCastException
         //如何解决？ 在 Person类实现Comparable 接口重写compareTo 方法
        System.out.println(treeSet);

    }


}

class Person implements Comparable{

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
