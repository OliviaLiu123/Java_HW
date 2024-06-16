package com.exercise.thread;
/*
1.有两个用户分别从同一个卡上取钱（总额10000）
2.每次都取1000，当余额不足时，就不能取款了
3.不能出现超取现象--》 线程同步问题
 */

// 思路分析，线程同步-关键：对敏感数据操作
// 在同一个时间只允许一个操作 money
// 现在有两个线程 T1,T2 他们都会操作money
// 有一个阻塞，然后获取锁，谁先获取锁谁操作
public class ThreadHW02 {
    public static void main(String[] args) {

        //如何不加机制
        T t = new T();
        Thread thread1 = new Thread(t);
        thread1.setName("t1");
        Thread thread2 = new Thread(t);
        thread2.setName("t2");
        thread1.start();
        thread2.start();



    }
}


//编写取款线程
//因为这里涉及到多个线程共享资源，所以使用实现接口的方式是最方便的
//2. 每次取1000
class  T implements Runnable{
    private int money=10000;
    @Override
    public void run() {

        while (true){
            //解读
            //1.这里使用了sychronized 实现了同步
            //2. 当多个线程执行到这里时就会去争夺this 对象锁
            //3.哪个线程获取到了this 对象锁，就执行sychronized  代码块， 执行完后，会释放this 对象锁
            //4. 争夺不到的就blocked , 准备继续争夺
            synchronized (this){//
                // 判断余额是否够用
                if(money<1000){
                    System.out.println("余额不足");
                    break;
                }
                money -=1000;
                System.out.println(Thread.currentThread().getName()+"取出了1000 当前余额="+money);
                //休眠1s

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }




        }

    }
}

class T1 extends Thread{




}

class T2 extends Thread{




}