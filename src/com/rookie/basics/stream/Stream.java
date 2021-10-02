package com.rookie.basics.stream;

import java.util.Collection;

/**
 *Java SE 8 关于流
 */
public class Stream {
    /**
     * 利用Collection接口的stream 方法
     * @param coll
     * @param <E>
     * @return
     */
    public <E> java.util.stream.Stream<E> creatStream(Collection<E> coll){
        return coll.stream();
    }


    public static void main(String[] args) {
    }
}
