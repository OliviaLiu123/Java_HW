package com.exercise.generic_;
/*
定义Employee 类
1）该类包含：private 成员变量name ,sal ,birthday, 其中 birthday 为MyDate 类的对象
2.为每一个属性定义getter, setter 方法
3.重写toString 方法输出name, sal, birthday
4.MyDate类包含：private 成员变量month, day,year, 并为每一个属性定义getter,setter 方法
5.创建该类的3个对象，并把这些对象放入ArrayList 集合中（ArrayList 需要用泛型来定义），对集合中的元素进行排序，并遍历输出
排序方式：调用ArrayList 的 sort方法， 传入Comparator 对象（使用泛型），先按照 name排序，如果name 相同，则按照生日日期的先后排序（即定制排序）
 */


import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom",10000,new Mydate(1997,10,12)));
        employees.add(new Employee("tom",15000,new Mydate(1997,10,3)));
        employees.add(new Employee("tom",17000,new Mydate(1980,3,3)));


        System.out.println("没有排序的employess="+employees);

        // 排序，并遍历输出
        System.out.println("===对雇员进行排序");

//        employees.sort(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee emp1, Employee emp2) {
//                //先按照 name排序，如果name 相同，则按照生日日期的先后排序（即定制排序）
//                /*
//                先对传入的参数进行验证
//
//                 */
//                if(!(emp1 instanceof Employee && emp2 instanceof Employee)){
//                    System.out.println("类型不正确。。");
//                    return 0;//不比了
//                }
//                //比较name
//                int i = emp1.getName().compareTo(emp2.getName());
//                if(i!=0){
//                    return i;
//                }
//
//                // 这一段应该在myDate 完成
//
//                // 如果name 相同就比较birthday -year
//                int yearDiff=emp1.getBirthday().getYear()-emp2.getBirthday().getYear();
//                if (yearDiff!=0){
//                    return yearDiff;
//                }
//                // 如果year 相同就比较month
//                int monthDiff=emp1.getBirthday().getMonth()-emp2.getBirthday().getMonth();
//
//                if (monthDiff !=0){
//                    return monthDiff;
//                }
//
//                // 如果  month 相同比较日
//
//                int dayDiff=emp1.getBirthday().getDay()-emp2.getBirthday().getDay();
//
//                if (dayDiff !=0){
//                    return dayDiff;
//                }
//
//
//
//                return 0;
//            }
//        });


        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) { //内部类
                //先按照 name排序，如果name 相同，则按照生日日期的先后排序（即定制排序）
                /*
                先对传入的参数进行验证

                 */
                if(!(emp1 instanceof Employee && emp2 instanceof Employee)){
                    System.out.println("类型不正确。。");
                    return 0;//不比了
                }
                //比较name
                int i = emp1.getName().compareTo(emp2.getName());//从小到大
//                int i = emp2.getName().compareTo(emp1.getName()); //从大到小

                if(i!=0){
                    return i;
                }
                //下面是对 birthday的比较
                //封装后，维护性和复用性提升 从小到大排
                return emp1.getBirthday().compareTo(emp2.getBirthday());




            }
        });

        System.out.println(employees);

    }

}
class Employee{
    private String name;
    private double sal;
    private Mydate birthday;
    public Employee(String name, double sal, Mydate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
class Mydate implements Comparable<Mydate>{
    public Mydate( int year,int month, int day) {
        this.month = month;
        this.year = year;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Mydate{" +
                "month=" + month +
                ", year=" + year +
                ", day=" + day +
                '}';
    }

    private int month;
    private int year;
    private int day;

    @Override
    public int compareTo(Mydate o) {// 把对year-month-day 比较放在这里

        // 如果name 相同就比较birthday -year
        // year 是this.year 这个类型的，o 是要比较的对象的
        int yearDiff=year-o.getYear();
        if (yearDiff!=0){
            return yearDiff;
        }
        // 如果year 相同就比较month
        int monthDiff=month-o.getMonth();

        if (monthDiff !=0){
            return monthDiff;
        }

        // 如果  month 相同比较日

        int dayDiff=day-o.getDay();

        if (dayDiff !=0){
            return dayDiff;
        }



        return 0;
    }
}








