package com.exercise.enums_;
/*
用enum 关键字来实现 enum类
 */
public class enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.FALL);
        System.out.println(Season2.SPRING);
        System.out.println(Season2.WINTER);
        System.out.println(Season2.SUMMER);
    }
}

enum Season2{
    // 如何使用 enum 来实现枚举类
    //1. 使用关键字enum 替代class
    //2.public static  final Season SPRING = new Season("春天","温暖"); 直接用SPRING("春天","温暖")
    //解读 常量名（实参列表）
    //3.如果有多个对象用 ， 间隔即可
    //4. 如果用 enum 来实现枚举，那么这些常量对象应该在最上面
    //5.如果后面有内容，还是需要构造器，构造器是private 方式创建
    //6.可以保留 toString()
    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    FALL("秋天","凉爽"),
    WINTER("冬天","寒冷");

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    //这个 variable 要放在常量下面
    private String name;
    private String desc;

@Override
    public String toString(){
    return "Season{"+ "name="+name+", dec="+desc+"}";
}




}