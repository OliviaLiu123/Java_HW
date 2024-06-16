package com.exercise.generic_;

import java.util.ArrayList;

public class Generic02 {

    public static void main(String[] args) {
        //1.引用泛型
        //1.当我们ArrayList<Dog>表示存放到ArrayList 集合中元素Dog类型
        //2.如果编译器发现类型添加的类型，不满足要求，就会报错
        //3.所以这里就是添加了一个泛型的约束
        //4.在遍历的时候，可以直接取出Dog 类型，而不是Object 类型
        // public class ArrayList<E>{} E 称为泛型

        ArrayList<Dog1> arraylist= new ArrayList<Dog1>();
        arraylist.add(new Dog1("旺财",10));
        arraylist.add(new Dog1("小黄",1));
        arraylist.add(new Dog1("小黑",2));
        // 假如不小心添加了猫怎么办？
//        arraylist.add(new Cat1("helloketty",8));

////遍历
//        for(Object o:arraylist){
//            //向下运行Object->Dog
//            Dog dog = (Dog) o;
//            System.out.println(dog.getName()+"-"+dog.getAge()); // 这样会发生ClassCastException 异常
//        }
        //使用泛型方法解决
        for(Dog1 dog:arraylist){

            System.out.println(dog.getName()+"-"+dog.getAge()); // 这样会发生ClassCastException 异常
        }

    }


}

class Dog1{
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Dog1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;



}

class Cat1{
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Cat1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;



}