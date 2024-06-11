package com.exercise.stringTest;

public class StudyString {
// goto Implements 看 String 如何实现
    public static void main(String[] args) {
        String name ="jack"; // 2."jack" 是字符串常量,双引号括起
        //3. 字符串的编码
        //4 常用构造器：间笔记
        //5.String 实现Serializable → 可以串行化→ 可以进行网络传输
        // 6.
        name="tom";
        System.out.println(name);
        final  char[] value ={'a','b','c'};
        char[] v2={'t','a','b'};
        value[0]='h';


    }
}
