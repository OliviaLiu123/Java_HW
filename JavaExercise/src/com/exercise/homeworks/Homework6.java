package com.exercise.homeworks;

//练习p436-441
/*
1.有一个交通工具接口类Vehicles,有Work 接口
2. 有Horse 类和Boat 类分别实现Vehicles
3.创建交通工具工厂类，有两个方法分别获得交通工具Horse 和Boat
4.有Person 类，有name 和Vechicles 属性，在构造器中位两个属性赋值
5.实例化Person 对象"唐僧"，要求一般情况下用Horse 作为交通工具，遇到大河时用Boat 作为交通工具
6.增加一个情况， 如果唐僧过火焰山使用飞机==》 程序扩展性
 */
public class Homework6 {
    public static void main(String[] args) {

       Person person = new Person("唐僧",new Horse());
       person.common();// 一般情况下
       person.passRiver();// 过河
        person.common();// 一般情况下
        person.passRiver();// 过河
        person.passRiver();// 过河
        person.passRiver();// 过河
        person.fly();


    }
}

class Horse implements Vehicles{
    @Override
    public void work(){
        System.out.println("一般情况下交通工具是马");
    }

}
class Boat implements Vehicles{
    @Override
    public void work(){
        System.out.println("过河的时候用船");
    }
}

class Plane implements Vehicles{
    @Override
    public void work(){
        System.out.println("过火焰山用飞机");
    }
}



class VehichleFactory{
// 创建交通工具工厂类
    // 这里将方法做成static
    private static Horse horse=new  Horse(); // 饿汉式
    //构造器也私有化, 不让创建对象
    private VehichleFactory(){

    }
    public static Horse getHorse(){
        // 马没有必要每次都new 一个新的。
//
        return  horse;
    }
    public static Boat getBoat(){
        // 船是每次都换新的
        return new Boat();
    }

    public static Plane getPlane(){
        // 船是每次都换新的
        return new Plane();
    }
}

class Person{
    // 在创建对象时就要创建一个交通工具
    private String name;
    private Vehicles vehicle;

    public Person(String name, Vehicles vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }
//实例化Person 对象"唐僧"，要求一般情况下用Horse 作为交通工具，遇到大河时用Boat 作为交通工具
    //涉及到一个编程思路，就是可以把具体的要求封装成方法-》oop
    // ？ 如何不浪费，在构建对象时，传入的交通工具对象
    public void passRiver(){
        //先得到船
        // 判断当前vechicles 属性是否已经存在了， 如果是null ，就获取马

//        Boat boat=VehichleFactory.getBoat();
//        boat.work();

        // 如何防止始终使用的是马，instanceOf
//        if(vechicle == null){
//            // 这里使用是多态
//            vechicle=VehichleFactory.getBoat();
//        }
        // 判断当前的vehicle instanseof Boat 是判断当前的vehicles 是不是boat
        //1)vehicles = null : vehicles instanseof Boat ->false
        //2)vehicles = 马对象 : vehicles instanseof Boat ->false
        //3)vehicles = 船对象 : vehicles instanseof Boat ->true
                if(!(vehicle instanceof  Boat)){
            // 这里使用是多态
                    vehicle=VehichleFactory.getBoat();
        }

        vehicle.work();
    }



    public void common(){
        //得到马
        // 判断当前vechicles 属性是否已经存在了， 如果是null ，就获取马
//        if(vehicle == null){
//            // 这里使用是多态
//            vehicle =VehichleFactory.getHorse();
//        }
        if(!(vehicle instanceof Horse)){
            // 这里使用是多态
            vehicle =VehichleFactory.getHorse();
        }


         //这里在调用的时候用接口调用而不是对象调用
        vehicle.work();
//        Horse horse=VehichleFactory.getHorse();
//        horse.work();
    }


    public void fly(){
        if(!(vehicle instanceof Plane)){
            // 这里使用是多态
            vehicle =VehichleFactory.getPlane();
        }
        vehicle.work();

    }
}


interface Vehicles{
  public void work();
}
interface Work{

}