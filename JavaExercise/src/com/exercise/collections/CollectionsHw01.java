package com.exercise.collections;

import java.util.ArrayList;

/*
1)封装一个新闻类，包含标题和内容属性，提供,get,set 方法，重写toString 方法，打印对象时只打印标题
2）只提供一个带参数的构造器，实例化对象时，只初始化标题，并且实例化两个对象：
新闻一：新冠确诊病例超千万，数百万印度教信徒赴恒河"圣浴"引起民众担忧
新闻二：男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生
3）将新闻对象添加到ArrayList 集合中，并且进行倒序遍历
4）在遍历集合过程中，对新闻标题进行处理，超过15字的只保留前15个，然后再后边加"..."
5)在控制台打印遍历出经过处理的新闻标题
 */
public class CollectionsHw01 {
    public static void main(String[] args) {
        ArrayList arraylist=new ArrayList();
        arraylist.add(new News("新冠确诊病例超千万，数百万印度教信徒赴恒河\"圣浴\"引起民众担忧"));
        arraylist.add(new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生"));
        int size=arraylist.size();
        //倒叙遍历
        for(int i =size-1;i>=0;i--){

            News news=(News)arraylist.get(i);

            System.out.println(processTitle(news.getTitle()));

        }




    }
    // 方法处理显示新闻标题
    public static String processTitle(String t){

        if (t==null){
            return "";

        }
        if(t.length()>15){
            return t.substring(0,15)+"...";
        }else{
            return t;
        }

    }
}

class News{
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public News(String title) {
        this.title = title;

    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +

                '}';
    }

    private String title;
    private String content;



}