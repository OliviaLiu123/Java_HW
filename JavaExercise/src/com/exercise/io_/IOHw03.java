package com.exercise.io_;
/*
1.要编写一个dog.properties
name =tom
age=5
color =red
2.编写Dog类（name,age,color）创建一个 dog对象，读取dog.properties 用相应的内容完成属性初始化并输出
3.将创建的Dog对象，序列化到文件dog.dat文件
 */


import com.sun.tools.javac.Main;
import org.junit.Test;

import java.io.*;
import java.util.Properties;

public class IOHw03 {

    public static void main(String[] args) throws IOException {
        String currentPath=new File(".").getAbsolutePath();
        System.out.println("Current working directory: " + currentPath);

        Properties properties = new Properties();
//        String filePath = "src/com/exercise/io_/dog.properties";
        String filePath = currentPath+"/JavaExercise/src/com/exercise/io_/dog.properties";

//        try (InputStream filePath = Main.class.getClassLoader().getResourceAsStream("dog.properties")) {
//            if (filePath == null) {
//                System.out.println("Sorry, unable to find dog.properties");
//                return;
//            }
//            System.out.println(filePath);
//            properties.load(filePath);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

        properties.load(new FileReader(filePath));

        String name = properties.get("name")+""; // 怎么把Object 转成string
        int age = Integer.parseInt(properties.get("age")+"");//把Object 转成int
        String color = properties.get("color")+"";

        Dog dog = new Dog(name,age,color);
        System.out.println("Dog 对象信息="+dog);
        // 将创建的Dog 对象，序列化到文件dog.dat 文件
        String serFilePath=currentPath+"/dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);
        oos.close();
        System.out.println("dog对象，序列化完成。。。");





    }


    // 在编写一个方法，反序列话
    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String currentPath=new File(".").getAbsolutePath();
        String serFilePath=currentPath+"/dog.dat";
        ObjectInputStream oos = new ObjectInputStream(new FileInputStream(serFilePath));
        Dog dog = (Dog)oos.readObject();
        System.out.println("===反序列化后 dog===");
        System.out.println(dog);


    }



}
class Dog implements Serializable{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }




}