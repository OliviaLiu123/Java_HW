package com.exercise.generic_;
/*
请编写程序，在ArrayList中，添加3个Dog 对象
Dog 对象含有name, age 并输出name, 和age(要求使用getxx())
 */


import java.util.ArrayList;

public class Generic01 {
    public static void main(String[] args) {
        // 使用传统的方法来解决

        ArrayList arraylist= new ArrayList();
        arraylist.add(new Dog("旺财",10));
        arraylist.add(new Dog("小黄",1));
        arraylist.add(new Dog("小黑",2));
        // 假如不小心添加了猫怎么办？
        arraylist.add(new Cat("helloketty",8));

        //遍历
        for(Object o:arraylist){
            //向下运行Object->Dog
            Dog dog = (Dog) o;
            System.out.println(dog.getName()+"-"+dog.getAge()); // 这样会发生ClassCastException 异常
        }


    }

}

class Dog{
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;



}

 class Cat{
     public String getName() {
         return name;
     }

     public int getAge() {
         return age;
     }

     public Cat(String name, int age) {
         this.name = name;
         this.age = age;
     }

     private String name;
     private int age;



 }