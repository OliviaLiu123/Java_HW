package com.exercise.generic_;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class GenericDetail {

    public static void main(String[] args) {
        /*
1.泛型的指定类型必须是引用类型，一般数据类型不行
 */
        List<Integer> list = new ArrayList<Integer>();
//        List<int> list1 = new ArrayList<int>();//错误

        /*
        2.在给泛型指定具体类型后，可以传入该类型或该类型的子类型
         */
        //因为E 指定了A 类型，构造其传入了一个new A()
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        Pig<A> aPig1 = new Pig<A>(new B());//B 是A 的子类型
        aPig1.f();
/*
3.泛型的使用形式
 */
        ArrayList<Integer> integers = new ArrayList<Integer>();
        List<Integer> integers1 = new ArrayList<Integer>();
        //在实际开发中，往往简写
        //推荐写法
        //为什么可以？编译器会进行类型推断，编译器会推断右边的类型是Integer
        ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        ArrayList<Pig> pigs = new ArrayList<>();//当new ArrayList<Pig>().val 的时候，编译器自动删除了Pig

        /*
        4.如果这样写 泛型默认是Object

         */
        ArrayList arrayList = new ArrayList(); //等价于ArrayList<Object> arrayList = new ArrayList();
        // 所以在添加时会默认为 Object arrayList.add(Object e);

        Tiger tiger = new Tiger();
        /*
        相当于 Tiger 是这样的
        class  Tiger{
            Object e;
            public Tiger(){}
}


         */



    }
}
class A{}

class B extends A{}

class Pig<E>{
    E e;
    public Pig(E e){
        this.e=e;
    }
    public void f(){
        System.out.println(e.getClass());
    }
}

class  Tiger{
    Object e;
    public Tiger(){}
}