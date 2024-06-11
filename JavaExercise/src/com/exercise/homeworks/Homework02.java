package com.exercise.homeworks;
//练习p436-441

import static com.exercise.homeworks.Frock.getNextNum;

public class Homework02 {
    public static void main(String[] args) {

    }
}
class Frock{
    private static int currentNum=100000;// 衣服出厂的序列号起始值
    private int serialNumber;
    public Frock(){
        serialNumber=getNextNum();
    }


    public int getSerialNumber() {
        return serialNumber;
    }



    public static int getNextNum(){
         currentNum+=100;
        return currentNum;

    }



}
class TestFrock{
    public static void main(String[] args) {
        System.out.println(getNextNum());//100100
        System.out.println(getNextNum());//100200
        Frock f1=new Frock();//10300

        Frock f2=new Frock();//10400

        Frock f3=new Frock();//10500
        System.out.println("序列号1 为："+f1.getSerialNumber());
        System.out.println("序列号2 为："+f2.getSerialNumber());
        System.out.println("序列号3 为："+f3.getSerialNumber());
    }

}
