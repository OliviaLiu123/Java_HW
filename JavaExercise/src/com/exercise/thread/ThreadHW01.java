package com.exercise.thread;
/*
1)在main方法中启动两个线程 // 就是主线程
2）第一个线程循环随机打印100以内的整数
3） 直到第二个线程从磁盘读取了"Q"命令
 */


import java.util.Scanner;

public class ThreadHW01 {
    public static void main(String[] args) {

        A a = new A();
        B b=new B(a);// 一定要注意，一定要传 a 才能控制
        a.start();
        b.start();



    }

}
//创建A 线程类
class A extends Thread{
    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    private boolean loop = true;
    @Override
    public void run() {
        //输出1-100
        while(loop){
            System.out.println((int)(Math.random()*100+1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

//创建线程B 直到第二个线程从磁盘读取了"Q"命令
// B 必须持有A 对象
class B extends Thread{
    private A a;
    private  Scanner scr = new Scanner(System.in);
    public B(A a) { // 构造器中直接 传A
        this.a = a;
    }
    @Override
    public void run() {
        // 接受到一个用户输入
        while(true){
            System.out.println("请输入你的指令Q 表示退出");
            char key=scr.next().toUpperCase().charAt(0);
            if(key == 'Q'){
                //以通知的方式结束a 线程
                a.setLoop(false);
                System.out.println("b线程退出");
                break;
            }


        }





    }





}