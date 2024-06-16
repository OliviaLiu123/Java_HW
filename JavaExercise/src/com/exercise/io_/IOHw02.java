package com.exercise.io_;

/*
要求：使用bufferedReader 读取一个文本文件，为每行加上行号，再连同内容一并输出到屏幕上
 */

import java.io.*;

public class IOHw02 {
    public static void main(String[] args) throws IOException {
        String filePath= "/Users/liulingjing/Desktop/Java_HW/mytemp/hello.txt";
        BufferedReader br = null;
        String line="";
        int lineNum =0;
        try{
            br= new BufferedReader(new FileReader(filePath));
            while((line = br.readLine())!=null){//循环读取
                System.out.println(++lineNum+line);

            }

        } catch (FileNotFoundException e) {
          e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            try {
                if(br !=null){
                    br.close();
            }
            }catch (IOException e){
                e.printStackTrace();
            }
        }


    }

}
