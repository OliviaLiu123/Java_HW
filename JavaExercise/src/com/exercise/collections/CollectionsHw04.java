package com.exercise.collections;


// hashset 和treeset 分别如何实现去重
// 见 notion 笔记
/*
 1) hashset : hashcode()+equals()，底层通过存入对象，进行运算等到一个hash 值，通过hash值得到对应的索引，
 如果发现table 索引所在位置，没有数据，就直接存放，如果有数据，就进行equals 比较（遍历比较），如果比较后，不相同，就加入
 否则就不加入
2） TreeSet: 如果你传入了一个Comparator 匿名对象，就使用实现的compare 去重，如果方法返回0，就认为是相同的元素/数据，就不添加，
如果你没有传入一个Comparator 匿名对象，则以你添加的对象实现的Comparable 接口的compareTo 去重

 */


public class CollectionsHw04 {

}
