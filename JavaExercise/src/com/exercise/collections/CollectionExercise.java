package com.exercise.collections;

/*
1.创建3个Dog(name,age)对象，放入到ArrayList中，赋给List 引用
2.用迭代器和增强for 循环两种方式来遍历
3.重写Dog 的toString 方法，输出name 和age
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {
        List list=new ArrayList();

        Dog dog1=new Dog("dog1",2);
        Dog dog2=new Dog("dog2",1);
        Dog dog3=new Dog("dog3",3);

        list.add(dog1);
        list.add(dog2);
        list.add(dog3);


        //先使用for 增强
        for (Object dog:list){
            System.out.println("dog="+dog);
        }
        // 使用迭代器
        System.out.println("===这是使用迭代器来遍历");
        Iterator iterator =list.iterator();
        while (iterator.hasNext()){
            Object dog=iterator.next();
            System.out.println("dog="+dog);
        }



    }


}

 class Dog{

     @Override
     public String toString() {
         return "Dog{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 '}';
     }

     private String name;
     private int age;


     public String getName() {
         return name;
     }

     public int getAge() {
         return age;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setAge(int age) {
         this.age = age;
     }




     public Dog(String name, int age) {
         this.name = name;
         this.age = age;
     }
 }