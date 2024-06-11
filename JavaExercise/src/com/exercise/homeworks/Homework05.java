package com.exercise.homeworks;
//练习p436-441
/*
编写一个类A ，在类中定义局部内部类B ，B 中有一个私有常量name,有一个方法show()打印常量name,进行测试
2.进阶：A 中定义一个私有的变量name,在show 方法中打印测试
 */
public class Homework05 {
    public static void main(String[] args) {
        A a1=new A();
        a1.f1();

    }
}
class A {
    private String name ="hello";
    private String NAME ="world";

    //局部内部类是在方法体中
     public void f1(){
         class B{

             private final String NAME ="常量a";

             public void show(){
                 System.out.println("常量name 是："+NAME);
                 //在内部类使用外部类的私有属性：直接用
                 //如果两个名字都是一样的那么它会遵守就近规则，所以都会输出 常量a
                 System.out.println("内部类NAME 是"+NAME+"外部类NAME 是"+NAME);
                 //如果两个名字都是一样的那么可以用 外部类.this.属性名来指定外部属性
                 System.out.println("内部类NAME 是："+NAME+"外部类NAME 是："+A.this.NAME);
                 System.out.println("外部类的Name是："+name);
             }

         }
         B b = new B();
         b.show();
     }


}