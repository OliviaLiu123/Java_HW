package com.exercise.homeworks;
//练习p436-441
public class Homework03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.sout();
        dog.sout();
    }


}
abstract class  Animal{

    public abstract void sout();
}
class Cat extends Animal{
    @Override
    public void sout(){
        System.out.println("猫会喵喵叫");
    }
}
class Dog extends Animal{
    @Override
    public void sout(){
        System.out.println("狗会汪汪叫");
    }
}