package java0727;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        //1.创建 ArrayList 实例
        List<String> arrayList = new ArrayList<>();
        //输出 arrayList 中的元素
        System.out.println(arrayList);
        //输出 arrayList 中元素的个数
        System.out.println(arrayList.size());
        //2.向ArrayList中添加元素
        arrayList.add("c");
        arrayList.add("c++");
        arrayList.add("java");
        arrayList.add("python");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        //根据下标添加元素
        arrayList.add(2,"javaScript");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        //3.删除元素
        //根据下标删除
//        arrayList.remove(2);
//        System.out.println(arrayList);
//        System.out.println(arrayList.size());
           //根据元素删除(需要遍历arrayList,与其中的元素进行比较）
//        arrayList.remove("java");
//        System.out.println(arrayList);
//        System.out.println(arrayList.size());
        //4.查找元素
        boolean ret = arrayList.contains("java");
        System.out.println("查找 Java 的结果为：" + ret);
        int index = arrayList.indexOf("c");
        System.out.println("查找 c 的结果为：" + index);
        //5.获取元素/修改元素
        String elem = arrayList.get(0);
        System.out.println("获取 0 号元素为:" + elem);
        arrayList.set(0,"PHP");
        System.out.println("修改后的顺序表" + arrayList);

        //6.遍历操作
        //a)使用下标来进行遍历
        System.out.println("使用下标遍历结果：");
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        //b)使用迭代器进行遍历
        System.out.println("通过迭代器遍历元素：");
        //先通过iterator方法获取到迭代器对象
        Iterator<String> iterator = arrayList.iterator();
        //再通过while循环来遍历(与scanner类似）
        while(iterator.hasNext()){
            String e = iterator.next();
            System.out.println(e);
        }
        //c) 使用for-each 进行遍历（本质上是通过迭代器来实现的）
        System.out.println("通过for-each 来遍历：");
        for(String x:arrayList){
            System.out.println(x);
        }


    }
}
