package com.exercise.thread;

/*
1.主线程每隔1s,输出hi,一共10次
2.当输出hi 5时，启动一个子线程（要求实现Runnable），每隔1s输出hello, 等该线程输出10次hello 后，退出
3.主线程继续输出hi, 直到主线程退出
 */

//其实就是一个线程插队
public class Thread01 {

    public static void main(String[] args) throws InterruptedException {
        Thread t3 = new Thread(new T3()); // 创建一个子线程对象
        for(int i=1;i<=10;i++){
            System.out.println("hi"+i);
            if(i==5){// 说明主线程输入了5次hi
                t3.start();//启动子线程 输出 hello...
                t3.join();//立即将t3 子线程，插入到main, 让t3 先执行


            }
            Thread.sleep(1000);//输出一次hi, 让 main 线程也休眠一次
        }

    }
}


//分线程
 class T3 implements Runnable{
    private int count =0;
     @Override
     public void run() {
         while(true){
             System.out.println("hello"+(++count));
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                e.printStackTrace();
             }
             if (count==10){
                 break;
             }

         }
     }
 }