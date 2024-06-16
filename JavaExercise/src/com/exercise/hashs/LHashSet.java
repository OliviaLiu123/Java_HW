package com.exercise.hashs;

/*
Car 类（属性：name, price）, 如果name 和price 一样，则认为是相同元素，就不能添加
 */

public class LHashSet {

    public static void main(String[] args) {
        //String a="hello";
        //String b ="hello";
        String s = "hello";
        String a = s;
        String b = s;

        System.out.println(a.equals(b));
        System.out.println(a==b);
    }



}
