package com.bjpowernode;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ForEachStudy {
    public static void main(String[] args) {
        //初始化数组
        int[] arrs = new int[10];
        //用for循环给数组赋值
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = i;
        }
        //用for循环输出数组
        for (int i = 0; i < arrs.length; i++) {
            System.out.print(arrs[i] + "，");
        }
        System.out.println();//换行
        System.out.println("==========================");
        //用foreach循环输出数组
        for (int arr : arrs){
            System.out.print(arr + "，");
        }
        System.out.println();//换行

        //创建map集合
        Map<Integer, String> map = new HashMap<>();
        //往集合中添加数据
        map.put(1, "第一个");
        map.put(2, "第二个");
        map.put(3, "第三个");
        map.put(4, "第四个");
        map.put(5, "第五个");
        map.put(6, "第六个");
        // 第一种方式：获取所有的key，通过遍历key，来遍历value
        Set<Integer> keys = map.keySet();//获取所有的key，所有的key是一个Set集合
        //使用foreach遍历集合
        for (Integer key : keys) {
            System.out.print(key + "=" + map.get(key) + ", ");
        }
        System.out.println();//换行
        System.out.println("==========================");
        //第二种方式：Set<Map.Entry<K,V>> entrySet()
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        //使用foreach遍历集合，获取key和value都是直接从node对象中获取的属性值
        for (Map.Entry<Integer, String> node : set) {
            System.out.print(node.getKey() + "=" + node.getValue() + ", ");
        }
    }
}

