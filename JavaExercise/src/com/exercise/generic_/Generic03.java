package com.exercise.generic_;

//泛型的作用是：可以在类声明时通过一个标识标识类中某个属性的类型
// 或者某个方法的返回值的类型，或者参数类型
//注意，特别强调，E 具体的数据类型在定义对象时指定的,即在编译期间就知道E 是什么
public class Generic03 {
    public static void main(String[] args) {
        Person<String> person = new Person<String>("java");
        /*
        可以理解，Person 类
        class Person{
        public Person(String s) {
        this.s = s;
    }

    String s;// 该数据类型是在定义Person 对象的时候指定的,即在编译期间就知道T 是什么

    public String f(){
        return  s;
    }

}
如果在创建是确定了类型，那么Person 类所有的T 都要换成该类型

         */

    }

}

class Person<T>{
    public Person(T s) {
        this.s = s;
    }

    T s;// 该数据类型是在定义Person 对象的时候指定的,即在编译期间就知道T 是什么

    public T f(){
        return s;
    }

}