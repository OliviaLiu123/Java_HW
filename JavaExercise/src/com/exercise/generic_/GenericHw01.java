package com.exercise.generic_;

/*
定义一个泛型类DAO<T> ,在其中定义一个Map 成员变量，Map 的键为String 类型，值为T 类型。

分别创建以下方法：
1）public void save（String id, T entity）:保存T 类型的对象到Map 成员变量中
2） public T get (String id)： 从map 中获取id 对应的对象
3）public void update(String id，T entity):替换 map中key 为id 内容，改为entity 对象
4） public List<T> list() : 返回map 中存放的所有T 对象
5）public void delete(String id): 删除指定id 对象

定义一个User 类：
该类包含：private 成员变量（int 类型）,id age ;(String 类型) name
创建DAO 类的对象，分别调用其save, get ,update, list ,delete 方法来操作 User 对象，
使用 Junit 单元测试类进行测试

 */


import org.junit.Test;

import java.util.*;

public class GenericHw01 {
    public static void main(String[] args) {

    }

    @Test
    public void testlist(){
        //说明
        // 给T 指定类型是User
        DAO<User> dao =new DAO<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,14,"tom"));
        dao.save("003",new User(3,19,"mike"));
        List<User> list=dao.list();
        System.out.println("list="+list);
        dao.update("003",new User(3,58,"milan"));
        System.out.println("===修改后===");
        list=dao.list();
        System.out.println("list="+list);

        System.out.println("===修改后 -删除001===");
        dao.delete("003");
        list=dao.list();
        System.out.println("list="+list);



    }



}

// 定义User 对象
class User{
    private int id;
    private int age;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }



    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }



}

class DAO<T>{// 泛型类
    Map<String, T> map = new HashMap<>();
    /*
    1）public void save（String id, T entity）:保存T 类型的对象到Map 成员变量中
    2） public T get (String id)： 从map 中获取id 对应的对象
    3）public void update(String id，T entity):替换 map中key 为id 内容，改为entity 对象
    4） public List<T> list() : 返回map 中存放的所有T 对象
    5）public void delete(String id): 删除指定id 对象
     */

    public void save(String id, T entity){
        map.put(id,entity);

    }
    public T get(String id){
        return map.get(id);
    }

    public void update(String id, T entity){
        map.put(id,entity);

    }
    public List<T> list(){
        // 把所有的key 放到集合中
        // 遍历map， 将map的所有value （entity），封装到Arraylist 返回即可
        List<T> list = new ArrayList<>();
        //遍历Map 返回 array.list
        Set<String> keySet = map.keySet();
        for (String key: keySet){
            list.add(get(key));

        }
        return  list;
    }
    public void delete(String id){
        map.remove(id);


    }

}