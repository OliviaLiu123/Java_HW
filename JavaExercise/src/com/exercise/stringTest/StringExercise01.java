package com.exercise.stringTest;

public class StringExercise01 {
    public static void main(String[] args) {
        // 测试题1 看最后打印是True 还是False
        String a ="abc"; //a 返回常量池的地址
        String b = "abc";
        System.out.println(a.equals(b));//T  equals是值相等
        System.out.println(a==b);//T


        // 测试题2 看最后打印是True 还是False
        String a1 = new String("abc");// a1 是指向堆
        String b1 = new String("abc");//b1指向堆
        System.out.println(a1.equals(b1));//T
        System.out.println(a1==b1);//F

        // 测试题3 看最后打印是True 还是False
        String a2="jack"; // a2 指向常量池的 "jack"
        String b2=new String("jack");//b2 指向堆中对象

        System.out.println(a2.equals(b2));//T
        System.out.println(a2==b2);//F a2是指向常量池的， b2 是指向堆的
        System.out.println(a2==b2.intern()); // T 返回常量池
        System.out.println(b2=b2.intern());//F b2.intern()指向常量池，b2是指向堆

        // 当调用 intern方法时，如果池已经包含一个等于此String 对象的字符串  ，则返回
        //池中的字符串。否则，将此String 对象添加到池中，并返回此String对象的引用。 b2.intern()方法最终返回常量池的地址（）
        System.out.println("第4题");
        //测试题 4 看最后打印是True 还是False
        String s1="python";
        String s2="java";// s2 和 s4 指向常量池中同一个地址
        String s4="java";
        String s3=new String ("java");// 指向堆
        System.out.println(s2==s3);// F
        System.out.println(s2==s4);//T
        System.out.println(s2.equals(s3));//T
        System.out.println(s1==s2);//F
        System.out.println("第五题");
        //测试题 5 看最后打印是True 还是False
        Person p1 = new Person();
        p1.name ="Tom";
        Person p2=new Person();
        p2.name ="Tom";

        System.out.println(p1.name.equals(p2.name)); //T 比较内容
        System.out.println(p1.name==p2.name);//T 两个都指向常量池
        System.out.println(p1.name=="Tom");//T "Tom" 在常量池

        // 练习 6
        // String 是一个final 类，代表不可变的字符序列
        // 字符串是不可变的，一个字符串对象一旦被分配，其内容是不可变的
        //以下语句创建了几个对象？
        String s11="hello";
        s11="haha";
/*
s11 创建了一个对象， s11->指向常量池，池里有个"hello"
s11 ="haha" 字符串不可变，修改了后就又重新创建了一个对象 , 创建两个对象
 */

    }





}
class Person{
    public  String name;
    Person(){};

}
