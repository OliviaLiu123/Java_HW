package com.exercise.homeworks;
//练习p436-441
//计算器接口有 work 方法，功能是运算。有一个手机类CellPhone,定义方法testWork 测试计算功能，调用计算接口的 work 方法
//要求调用CellPhone 对象的testWork 方法，使用上匿名内部类

public class Homework04 {
    public static void main(String[] args) {
        CellPhone cellphone = new CellPhone();
        /*1.匿名内部类是
        new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            } 同时也是一个对象
          它的编译类型是这个接口类型Calculator ,它的运行类型是匿名内部类
         */
        cellphone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },10,8); //这里传入测试的数
        //在匿名内部类实现方法可以灵活改变testwork实现方式
        cellphone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1*n2;
            }
        },25,8);
    }
}
 class CellPhone {
// 当我们调用testWork 方法时直接传入一个实现了Calculator 接口的匿名内部类即可，该匿名内部类可以灵活的实现 work 方法。
 public void testWork(Calculator cal , double n1, double n2){
     double result =cal.work(n1,n2);// 动态绑定规则
     System.out.println("计算后的结果是："+result);


 }
 }

 // 编写接口， 该方法完成怎么样的计算，在匿名类完成
interface Calculator {
    public double work(double n1, double n2);
}