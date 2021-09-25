package com.rookie.basics.temp;

import java.io.*;
import java.util.*;

public class Test {
    /**
     *
     */
    public void testComparator(){
        class myComparator implements Comparator<Integer>{

            public int compare(Integer o1, Integer o2) {
                //升序
                if(o1 < o2){
                    return -1;
                }else if(o1 > o2){
                    return 1;
                }else{
                    return 0;
                }
            }
        }

//        Collections.sort();
    }

    /**
     * 请使用LinkedList来模拟一个队列(先进先出的特性): [必做题]
     * 1.1 拥有放入对象的方法void put(Object o)
     * 1.2 取出对象的方法Object get()
     * 1.3 判断队列当中是否为空的方法boolean isEmpty()；并且，编写测试代码，验证你的队列是否正确。
     */
    public void testQueue(){
        class Queue{
            private LinkedList queue;
            Queue(LinkedList list){
                this.queue = list;
            }

            public void put(Object o){
                queue.add(o);
            }

            public Object get(){
                return this.queue.getLast();
            }

            public boolean isEmpty(){
                return this.queue.isEmpty();
            }
        }
    }

    /**
     * 假设顺序列表ArrayList中存储的元素是整型数字1~5，遍历每个元素，将每个元素顺序输出
     */
    public void testArrayList1(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * 在一个列表中存储以下元素：apple,grape,banana,pear
     * 3.1 返回集合中的最大的和最小的元素
     * 3.2 将集合进行排序，并将排序后的结果打印在控制台上
     */
    public void testArrayList2(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("grape");
        arrayList.add("banana");
        arrayList.add("pear");


    }

    /**
     * 编写一个程序，创建一个 HashMap对象，
     * 用于存储银行储户的信息(其中储户的主要信息有储户的ID，姓名和余额)。
     * 另外，计算并显示其中某个储户的当前余额。
     */
    public void testMap(){
//        HashMap<String,String>
    }

    /**
     * 浮点数具有有限的计算精度
     */
    public void testDouble(){
        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        System.out.println(x == 0.5);
        System.out.println(x);
    }

    /**
     * 利用Math.random()方法生成任意范围的随机数
     * 0.0 <= Math.random() < 1.0
     */
    public void testRandom(){
        int i = 20 + (int) (Math.random() * 30); //返回20~50之间的随机数，不包括50
        System.out.println(Math.random());
        System.out.println(Math.random() * 30);
    }

    public void testCodeBlock(){
        {
            int a = 10 ;
            System.out.println(a);
        }

//        System.out.println(a);
    }

    public void testSum(){
        Scanner input = new Scanner(System.in);
        System.out.println("输入两个数（#号间隔）：");
        String source = input.next();
        int first = Integer.parseInt(source.substring(0,source.indexOf('#')));
        int second = Integer.parseInt(source.substring(source.indexOf('#')+1));

        System.out.println("和为："+(first+second));
    }

    public void testShowTimes(){
        Scanner input = new Scanner(System.in);
        System.out.println("输入字符串：");
        String source = input.next();

        int times = source.split("e").length;

        System.out.println("e出现的次数："+times);
    }

    public void testRandomAndSort(){
        int[] source = new int[10];
        for(int i = 0 ; i < 10 ; i++){
            source[i]=(int)(Math.random()*100)+1;
        }

        for(int i = 1 ; i <= 10 ; i++){
            for(int j = i-1 ; j < 10 - j  ; j++){
                if(source[j]<source[j+1]){
                    int temp = source[j+1];
                    source[j+1] = source[j];
                    source[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(source));
    }

    public void testTime(){

    }

    public void testEmail(){
        Scanner input = new Scanner(System.in);
        String source = input.next();
        if(!source.contains("@")||!source.contains(".")){
            System.out.println("不败含@或.");
        }else if(source.indexOf('@')!=source.lastIndexOf('@')){
            System.out.println("邮箱地址多了@");
        }else if(source.indexOf('.')!=source.lastIndexOf('.')){
            System.out.println("邮箱地址多了.");
        }else if(source.indexOf('.')-source.indexOf('@') < 0){
            System.out.println("邮箱地址中.出现在@的前面");
        }else{
            System.out.println(source.substring(0,source.indexOf('@')));
            System.out.println(source.substring(source.indexOf('@')+1));
        }
    }

    public static void main(String[] args){
//        new Test().testSum();

    }
}
