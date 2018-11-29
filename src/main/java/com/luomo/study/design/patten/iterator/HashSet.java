package com.luomo.study.design.patten.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author LiuMei
 * @date 2018-11-29.
 */
public class HashSet<E> implements Iterable<E>{

    private static final Object NULL = new Object();

    private Map<E, Object> map = new HashMap<>();

    public void add(E e){
        map.put(e, NULL);
    }

    public int size(){
        return map.size();
    }

    public Object[] toArray(){
        return map.keySet().toArray();
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }
}
