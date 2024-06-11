package com.exercise.CatchException;

// p457
/*
以下代码是否会发生异常，如果会，哪种？ 如果不会打印结果是什么
 */
public class Exception02{
    public static void main(String[] args) {
        // ArrayIndexoutofBoundsException
        if(args[4].equals("john")){ // 可能发生NullPointerException
            System.out.println("AA");
        }else{
            System.out.println("BB");
        }
        Object o =args[2]; //String ->Object ，向上转型
        Integer i = (Integer)o;// 错误，这里一定会发生ClassCastException
    }


}
