package com.exercise.enums_;

public class enumeration01 {

    public static void main(String[] args) {
        System.out.println(Season.FALL);
        System.out.println(Season.SPRING);
        System.out.println(Season.WINTER);
        System.out.println(Season.SUMMER);

    }
}

/*
自定义枚举
1.将构造器私有化，防止直接被new 出来
2.去掉 set方法，防止属性被修改
3.在该类内部直接创建固定的对象
4,优化，加入final 修饰符
 */

class Season{
    //防止创建对象
    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }


    private String name;
    private String desc;
    //定义四个对象，直接创建了固定对象，以后不能修改了
    public static  final Season SPRING = new Season("春天","温暖");
    public static  final Season SUMMER = new Season("夏天","炎热");
    public static  final Season FALL = new Season("秋天","落叶");
    public static  final Season WINTER = new Season("冬天","寒冷");

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
@Override
    public String toString(){
        return "Season{"+ "name="+name+", dec="+desc+"}";
}

}