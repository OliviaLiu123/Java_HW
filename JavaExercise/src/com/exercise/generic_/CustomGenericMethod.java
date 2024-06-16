package com.exercise.generic_;
/*
泛型方法的使用
 */


import java.util.ArrayList;

public class CustomGenericMethod {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("baoma",100);// 当调用方法时，传入参数，编译器，就会确定类型
        System.out.println("===");
        car.fly(100,101.2);
        //测试
        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(),11.3f);

    }

}

/*
1. 泛型方法，可以定义在普通类中，也可以定义在泛型类中
 */

class Car{// 普通方法
    public  void run(){

    }
    //说明，<T,R>是泛型标识符，
    //2.提供给fly 方法使用

    public <T, R> void fly(T t, R r){
        //泛型方法
        System.out.println(t.getClass());
        System.out.println(r.getClass());


    }







}
// 泛型类中也可以使用

 class Fish <T,R>{
     public  void run(){

     }
     //最好和泛型类的泛型方法区分开
     public <U, M> void eat(U u, M m){
         //泛型方法
     }


     //3. 方法使用泛型和泛型方法
     // 这个不是一个泛型方法因为public <> 后面没有<>
     // shi hi 方法声明泛型
     public void hi(T t){

     }
     // 泛型方法，可以使用类声明的泛型，也可以使用自己声明的泛型
     public<K>  void hello(R r,K k){
         System.out.println(r.getClass());//ArrayList
         System.out.println(k.getClass());//Float
     }

//     public void hello1(R r,K k){// 报错
//         System.out.println(r.getClass());
//         System.out.println(k.getClass());//报错

         //区别，如果泛型方法不声明 public <k> 那么后面的参数不能是K 类型，只能是 T /E 或者是类定义的泛型
         // 不然就报错
     }
