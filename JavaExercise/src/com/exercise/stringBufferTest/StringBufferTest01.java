package com.exercise.stringBufferTest;

public class StringBufferTest01 {

    public static void main(String[] args) {
        //下面代码输出什么？为什么
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);


        // 2. 输入商品名称和商品价格，要求打印效果示例， 使用前面学的方法完成
        // 商品名  商品价格
        //手机     123，,546，,59
        // 要求：价格的小数点前面每3位用逗号隔开，再输出


    }
}
