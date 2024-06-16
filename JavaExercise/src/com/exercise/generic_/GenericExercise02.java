package com.exercise.generic_;
/*
泛型在HashSet， HashMap 中的应用
1.创建3个学生对象
2.放到HashMap 和HashSet 中 要求 key是String name， Value 就是学生对象
3.使用两种方式遍历
 */


import java.util.*;

public class GenericExercise02 {
    public static void main(String[] args) {
        //使用泛型hashSet 放入3个学生对象
        HashSet<Student>  students = new HashSet<Student>();
        students.add(new Student("jack",21));
        students.add(new Student("Tom",18));
        students.add(new Student("Mike",19));
        //遍历用增强for 循环
        for (Student s: students){
            System.out.println(s);

        }


        HashMap<String,Student> hashmap = new HashMap<String,Student>();
        hashmap.put("jack",new Student("jack",21));
        hashmap.put("Olivia",new Student("olivia",18));
        hashmap.put("Kiki",new Student("jack",22));


        //遍历Map 用迭代器
        /*
        public Set<Map.Entry<K,V>> entrySet() {
        Set<Map.Entry<K,V>> es;
        return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
    }
         */
        Set<Map.Entry<String,Student>> entries = hashmap.entrySet();
        /*
          final class EntrySet extends AbstractSet<Map.Entry<K,V>> {
        public final int size()                 { return size; }
        public final void clear()               { HashMap.this.clear(); }
        public final Iterator<Map.Entry<K,V>> iterator() {
            return new EntryIterator();
        }
         */
        System.out.println("用迭代器遍历");
        Iterator<Map.Entry<String,Student>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Student> next =iterator.next();
            System.out.println(next.getKey()+"-"+next.getValue());
        }

    }
}
class Student{
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age){
        this.name = name;
        this.age=age;

    }

}