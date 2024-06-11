package com.exercise.homeworks;
////练习p436-441
/*
1.创建一个Color 枚举类
2.有RED,BLUE,BLACK,YELLOW,GREEN 这5个枚举值/对象；
3.color 有3个属性，redValue,greenValue,blueValue
4.创建构造方法，参数包括这三个属性
5.每个枚举值都要给这三个属性赋值，三个属性对应的值分别是
6.red :255,0,0 blue:0,0,255 black: 0,0,0 yellow :255,255,0 green :0,255,0
7. 定义接口，里面的方法有show, 要求Color 实现该接口
8.show 方法中显示3个属性值
9.将枚举对象在 switch 中匹配用

 */
public class Homework08 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        //switch () 中，放入枚举对象，再每个case 后直接写上再枚举类中定义的枚举对象
        switch(green){
            case YELLOW :
                System.out.println("匹配到黄色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case GREEN:
                System.out.println("匹配到绿色");
                break;
            default:
                System.out.println("没有匹配到");
        }

    }


}
enum Color implements Method{
    RED(225,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;

    }

    private int redValue;
   private int greenValue;
   private int blueValue;


    @Override
    public void show() {
        System.out.println("属性值为："+redValue+','+greenValue+','+blueValue);
    }
}

interface Method{
    public void show();
}