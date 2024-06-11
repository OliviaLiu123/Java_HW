package com.exercise.collections;

/*
1)使用HashMap类实例化一个Map 类型的对象m,键（String）和值（int）分别用于存储员工的姓名和工资，
存入数据如下：jack-650 元，tom->1200, smith->2900元
2）将jack 的工资更改为2600
3）将所有员工的工资加薪100
4）遍历集合中所有的员工
5）遍历集合中所有的工资

 */

import java.util.*;

public class CollectionsHw03 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack",650);//int->装箱成Integer 放进去
        m.put("tom",1200);
        m.put("smith",2900);
        System.out.println(m);
        System.out.println("修改前jack的工资是："+m.get("jack"));
        //将jack 的工资更改为2600
        m.put("jack",2600);
        System.out.println("修改后jack的工资是："+m.get("jack"));
        //3）将所有员工的工资加薪100
        //用keySet的方式遍历
        Set keySet = m.keySet();
        for (Object key: keySet){
            //更新
            m.put(key,(Integer)m.get(key)+100);
        }
        System.out.println(m);

        //4）遍历集合中所有的员工
        System.out.println("====遍历===");
        //用EntrySet
        Set entrySet = m.entrySet();
        //迭代器
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry entry=(Map.Entry)iterator.next();
            System.out.println(entry.getKey()+"-"+entry.getValue());


        }


        //5）遍历集合中所有的工资
        System.out.println("遍历所有的工资");
        Collection values=m.values();
        for (Object value:values){
            System.out.println("工资="+value);
        }

    }
}




