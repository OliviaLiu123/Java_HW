package com.exercise.hashs;
/*
使用HashMap添加3个员工对象，要求：  key: 员工id 值：员工对象
遍历显示工资> 18000的员工（遍历方式最少两种）
员工类：姓名，工资，员工id


 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapHW {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Object jack = hashMap.put(1,new Employee("jack",30000,1));
        Object Tom = hashMap.put(2,new Employee("Tom",6000,2));
        Object Mike = hashMap.put(3,new Employee("Mike",30050,3));

        //遍历2种方式
        //1. 使用keySet->增强for
        Set keySet = hashMap.keySet();
        System.out.println("第一种遍历方式");
        for (Object key:keySet){
            //先获取value
            Employee emp = (Employee) hashMap.get(key);
            if(emp.getSalary()>18000){
                System.out.println(emp);
            }

        }


        //2. 使用EntrySet->迭代器
        Set entrySet = hashMap.entrySet();
        System.out.println("====");
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            //通过entry 取得key 和value
            Employee emp =(Employee) entry.getValue();
            if(emp.getSalary()>18000){
                System.out.println(emp);
            }

        }



    }


}

class Employee{
    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private String name;
    private double salary;
    private int id;


    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }





    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }




}