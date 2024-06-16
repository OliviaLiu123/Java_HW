package com.exercise.generic_;


/*
自定义泛型
 */
public class CustomGeneric {

    public static void main(String[] args) {
        Tiger1<Double,String ,Integer> g = new
                Tiger1<>("john");//ok

        g.setT(10.9);//ok
//        g.setT("yy");// 错误，因为给的T 的类型是double

        Tiger1 g2=new Tiger1("John~~");//ok T object ,R object ,
        g2.setT("yy");//可以，因为T 是Object, String 是O bject子类


    }
}

// 1. Tiger1 后面泛型，所以我们把Tiger1 就成为自定义泛型
//2.T,R,M 泛型的标识符，一般是单个大写字母
//3.泛型的标识符可以有多个
//4. 普通成员可以使用泛型（属性，方法）
//5.使用泛型的数组中不能初始化
//6.静态方法不能使用泛型
class Tiger1<T,R,M>{
    private String name;
   //Type parameter 'T' cannot be instantiated directly
    //因为这个数组在 new的时候,T类型没有确定下来，所以不知道开辟多少空间
//   T[] ts=new T[8];//报错
    T[] ts;
    public Tiger1(String name){
        this.name = name;
    }

    public Tiger1( M m, T t, R r) {

        this.m = m;
        this.t = t;
        this.r = r;
    } // 属性使用到泛型， 方法也使用到泛型 ，这里说明的是 创建对象时M,T,R 可以是不同类型，但是如果只有T 那么
    // 说明所有泛型的变量 创建的类型是一样的

    public M getM() {
        return m; // 返回类型可以使用泛型
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }
//com.exercise.generic_.Tiger1.this' cannot be referenced from a static context
    // 因为静态是和类相关的，在类加载时，对象还没有创建
    //所以如果静态方法和静态属性使用了泛型，那么JVM 就无法完成初始化
    // 因为不知道R 是什么类型， R 只有在对象定义时才知道
//    public static void m1(M m){}//报错
    // static R r2;// 报错

    private M m;
    private T t;
    private R r;



}


/*
说明自定义泛型代码是否正确，并说明原因
Tiger1<Double,String ,Integer> g = new
Tiger1<>("john");

g.setT(10.9);
g.setT("yy");
System.out.println(g);
Tiger1 g2=new Tiger1("John~~");
g2.getT("yy");//
System.out.println("g2=="+g2);




 */