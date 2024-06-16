package com.exercise.io_;

/*
1.在判断e盘下是否有文件夹mytemp，如果没有就创建mytemp
2.在e:\\mytemp目录下，创建文件hello.txt
3.如果hello.txt 已经存在，提示该文件已经存在，就不要再重复创建了
4.并且在hello.txt 中写入hello world~
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOHw01 {

    public static void main(String[] args) throws IOException {
        String directoryPath = "/Users/liulingjing/Desktop/Java_HW/mytemp";
        File file = new File(directoryPath);
        if(!file.exists()){
            //创建
            if(file.mkdirs()){
                System.out.println("创建"+directoryPath+"创建成功");
            }else{
                System.out.println("创建"+directoryPath+"创建失败");
            }
        }
        String filePath=directoryPath+"/hello.txt";
        file = new File(filePath);
        if(!file.exists()){
            //创建文件
            if(file.createNewFile()){
                System.out.println(filePath+"创建成功！");
                //如果文件存在，我们就用BufferWriter字符输入流写入内容
                BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(file));
                bufferWriter.write("hello, world~~");
                bufferWriter.close();


            }else{
                System.out.println(filePath+"创建失败！");
            }
        }else{
            //如果文件已经存在，给出信息不在重复创建
            System.out.println(filePath+"已经存在不再创建");
        }

    }
}
